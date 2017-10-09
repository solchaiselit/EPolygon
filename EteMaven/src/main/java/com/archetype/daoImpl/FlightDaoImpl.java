package com.archetype.daoImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import com.archetype.entity.City;
import com.archetype.entity.Flight;
import com.archetype.entity.User;
import com.archetypes.dao.FlightDao;

public class FlightDaoImpl implements FlightDao {

	private final EntityManager manager;
	
	
	public FlightDaoImpl(EntityManager manager) {
		super();
		this.manager = manager;
	}

	public void save(Flight flight) {
	
		manager.getTransaction().begin();
		
		manager.persist(flight);
		
		manager.getTransaction().commit();
		
	}

	public Flight findOne(City cityFrom, LocalDate departureDate, LocalTime departureTime) {
		
		manager.getTransaction().begin();
		
		Flight flight = null;
		
		try{
		
		flight = (Flight) manager.createQuery("select f from Flight f where f.cityFrom =:cityFrom"
				+ " and f.departureDate =:departureDate and f.departureTime =:departureTime").
			setParameter("cityFrom", cityFrom).setParameter("departureDate", departureDate).setParameter("departureTime", departureTime).getSingleResult();
		
		
		} catch(NonUniqueResultException e){
			
			System.out.println(e.getMessage());
		}catch(NoResultException e){
			System.out.println(e.getMessage());
		}
		
		finally{manager.getTransaction().commit();}
		
		return flight;
	}

	public List<Flight> findFlightsByCitiesAndDate(City cityFrom, City cityTo, LocalDate departureDate) {
		
		List<Flight> flights = null;
		
		List<Flight> transferFlights = null;
		
		
		manager.getTransaction().begin();
		
		flights = manager.createQuery("select f from Flight f where f.cityFrom =:cityFrom "
				+ " and f.cityTo =:cityTo and f.departureDate =:departureDate")
				.setParameter("cityFrom", cityFrom).setParameter("cityTo", cityTo)
				.setParameter("departureDate", departureDate).getResultList();
		
//		manager.createQuery("from Flight f left join fetch f.cityTo ct "
//				+ "left join fetch ct.flightsFrom fl where "
//				+ "f.departureDate=fl.departureDate and ct = fl.cityFrom").getResultList();
		
//		transferFlights = manager.createQuery("select distinct f from Flight f1 left join fetch"
//				+ " f1.flight f2 "
//				+ "with f1.cityFrom =f2.cityTo", Flight.class).getResultList();
		
//		transferFlights = manager.createQuery("select f from Flight f1 inner join Flight f2"
//				+ " on f1.cityTo = f2.cityFrom "
//				+ "where f1.departureDate = f2.departureDate and f1.cityFrom =:value1 and f2.cityTo =:value2 "
//				+ "and f1.departureDate =:value3").setParameter("value1", cityFrom).setParameter("value2", cityTo)
//				.setParameter("value3", departureDate).getResultList();
		
//		for(Flight f: transferFlights){
//			
//			flights.add(f);
//		};
		
		
		manager.getTransaction().commit();
		
		return flights;
	}

	public List<Flight> findAll() {
		
		manager.getTransaction().begin();
		
		List<Flight> flights = manager.createQuery("from Flight").getResultList();
				
		manager.getTransaction().commit();
		
		return flights;
	}

	public void delete(City cityFrom, LocalDate departureDate, LocalTime departureTime) {
		
				
		Flight flight = findOne(cityFrom, departureDate, departureTime); 
		
		manager.getTransaction().begin();
		
		manager.remove(flight);
		
		manager.getTransaction().commit();
		
	}

	public void update(Flight flight) {
	
		manager.getTransaction().begin();
		
		manager.merge(flight);
		
		manager.getTransaction().commit();		
	}

	public void addUserToFlight(User user, Flight flight) {
		
		if(flight.getFreeSeats()>0){
		
		manager.getTransaction().begin();
		
		flight.setFreeSeats(flight.getFreeSeats()-1);
		
		flight.getUsers().add(user);
		
		manager.merge(flight);
		
		manager.getTransaction().commit();
		}
		
		else{
			System.out.println("No free seats left");
		}
	}

	
	
}
