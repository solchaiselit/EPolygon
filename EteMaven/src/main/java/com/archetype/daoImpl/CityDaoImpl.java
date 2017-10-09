package com.archetype.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import com.archetype.entity.City;
import com.archetype.entity.Flight;
import com.archetypes.dao.CityDao;

public class CityDaoImpl implements CityDao {

	private final EntityManager manager;
	
	
	
	public CityDaoImpl(EntityManager manager) {
		super();
		this.manager = manager;
	}

	public void save(City city) {
		
		manager.getTransaction().begin();
		
		manager.persist(city);
		
		manager.getTransaction().commit();
		
	}

	public City findOne(String name) {
		
		City city = null;

		manager.getTransaction().begin();
		
		try{
			
			city = (City) manager.createQuery("select c from City c where c.name =:name").setParameter("name", name).
			getSingleResult();		
			
			
		}catch(NonUniqueResultException e){
			
			e.getMessage();
		}catch(NoResultException e){
			
			e.getMessage();
		}
		
		manager.getTransaction().commit();
		
		return city;
	}

	public List<City> findAll() {
		
		
		manager.getTransaction().begin();
		
		List<City> cities = manager.createQuery("from City").getResultList();

		manager.getTransaction().commit();
		
		return cities;
	}

	public void delete(String name) {
		
		City city = findOne(name);
		
		List<Flight> flightsFrom = new ArrayList<Flight>();
		
		List<Flight> flightsTo = new ArrayList<Flight>();
		
		manager.getTransaction().begin();
		
		flightsFrom = city.getFlightsFrom();
		
		flightsTo = city.getFlightsTo();
		
//		flights = manager.createQuery("select f from Flight f where f.cityFrom_id =:value or"
//				+ " f.cityTo_id =:value").
//				setParameter("value",city.getId()).getResultList();
		
		for(Flight f: flightsFrom){
			
			f.setCityFrom(null);
			
		}
		
		for(Flight f: flightsTo){
			
			f.setCityTo(null);
			
		}
		
		manager.remove(city);
		
		manager.getTransaction().commit();
		
	}

		public void update(String name) {
	
		City city = findOne(name);
			
		manager.getTransaction().begin();
		
		manager.merge(city);
		
		manager.getTransaction().commit();
		
	}

	public void addFlightToCity(Flight flight, City cityTo) {
		
		
		manager.getTransaction().begin();
		
		flight.setCityTo(cityTo);
		
//		manager.merge(flight);
		
		manager.getTransaction().commit();
		
		
	}

	public void addFlightFromCity(Flight flight, City cityFrom) {
		
		manager.getTransaction().begin();
		
		flight.setCityFrom(cityFrom);
		
//		manager.merge(flight);
		
		manager.getTransaction().commit();
		
	}

	
	
	
}
