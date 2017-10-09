package com.archetype.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.type.LocalDateType;

import com.archetype.daoImpl.CityDaoImpl;
import com.archetype.daoImpl.FlightDaoImpl;
import com.archetype.daoImpl.UserDaoImpl;
import com.archetype.entity.City;
import com.archetype.entity.Flight;
import com.archetype.entity.User;
import com.archetypes.dao.CityDao;
import com.archetypes.dao.FlightDao;
import com.archetypes.dao.UserDao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		
		EntityManager manager = factory.createEntityManager();
		
		FlightDao flightDao = new FlightDaoImpl(manager);
		
		CityDao cityDao = new CityDaoImpl(manager);
		
		UserDao userDao = new UserDaoImpl(manager);
		
		
		List<Flight> flights = flightDao.findFlightsByCitiesAndDate(cityDao.findOne("Tokyo"), cityDao.findOne("Lviv"),
				LocalDate.of(2017, Month.SEPTEMBER, 1));
		
	manager.createQuery("from Flight f left join fetch f.cityTo ct "
				+ "left join fetch ct.flightsFrom fl where "
				+ "f.departureDate=fl.departureDate and ct = fl.cityFrom").getResultList();
		
		for(Flight f: flights){
			System.out.println(f.toString());
		}
		
//		flightDao.addUserToFlight(userDao.findOne("Dangerous", "Man"), 
//				flightDao.findOne(cityDao.findOne("Tokyo"), LocalDate.of(2017, Month.SEPTEMBER, 1), 
//						LocalTime.of(12, 45)));
		

//		
//		Flight flight = new Flight();
//		
//		City city = new City();
//		City city1 = new City();
//		City city2 = new City();
//
//		
//		User user = new User();
//		User user1 = new User();
//		
//		city.setName("Lviv");
//		city1.setName("Tokyo");
//		city2.setName("NY");
//		
//		cityDao.save(city);
//		cityDao.save(city1);
//		cityDao.save(city2);
//
//		
//		user1.setFirstname("Dangerous");
//		user1.setLastName("Man");
//		user1.setEmail("man@");
//		user1.setPassword("pass");
//		
//
//		flight.setCityTo(cityDao.findOne("NY"));
//		flight.setCityFrom(cityDao.findOne("Lviv"));
//		
//		flight.setDepartureDate(LocalDate.of(2017, Month.SEPTEMBER, 1));
//		flight.setDepartureTime(LocalTime.of(14,00));
//		
//		flight.setArrivalDate(LocalDate.of(2017, Month.SEPTEMBER, 1));
//		flight.setArrivalTime(LocalTime.of(16, 50));
//	
//		flight.setFreeSeats(200);
//		flight.setPrice(570);
//		
//		flightDao.save(flight);
//		
//		Flight flight1 = new Flight();
//		
//		flight1.setCityFrom(cityDao.findOne("Tokyo"));
//	
//		flight1.setCityTo(cityDao.findOne("Lviv"));
//		
//		flight1.setDepartureDate(LocalDate.of(2017, Month.SEPTEMBER, 1));
//		flight1.setDepartureTime(LocalTime.of(14, 30));
//		
//		flight1.setArrivalDate(LocalDate.of(2017, Month.SEPTEMBER, 1));
//		flight1.setArrivalTime(LocalTime.of(17, 20));
//		
//		flight1.setFreeSeats(150);
//		flight1.setPrice(360);
//		
//		flightDao.save(flight1);
//		
//		cityDao.addFlightToCity(flight, cityDao.findOne("Lviv"));
//		
//		cityDao.addFlightFromCity(flight, cityDao.findOne("Tokyo"));
//			
//		userDao.save(user);
//		userDao.save(user1);

		
		manager.close();
		
		factory.close();
		
		
	}

}
