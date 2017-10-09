package com.archetype.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import com.archetype.entity.Flight;
import com.archetype.entity.User;
import com.archetypes.dao.UserDao;


public class UserDaoImpl implements UserDao {

	private final EntityManager manager;
	
	
	
	public UserDaoImpl(EntityManager manager) {
		super();
		this.manager = manager;
	}

	public void save(User user) {
		
		manager.getTransaction().begin();
		
		manager.persist(user);
		
		manager.getTransaction().commit();
		
	}

	public User findOne(String firstName, String lastName) {
		
		manager.getTransaction().begin();
		
		
		User user = null;
		
		try{
		
		user = (User) manager.createQuery("select u from User u where u.firstName =:value1"
				+ " and u.lastName =:value2").setParameter("value1", firstName).
				setParameter("value2", lastName).
				getSingleResult();
		
//		System.out.println(user.toString());
		
		}catch(NonUniqueResultException e){
			
			System.out.println(e.getMessage());
		}catch(NoResultException e){
			
			System.out.println(e.getMessage());
			
		}finally{
		
		
		manager.getTransaction().commit();
		}

		
		return user;
	}

	public List<User> findAll() {
		
		manager.getTransaction().begin();
		
		List<User> list = manager.createQuery("from User").getResultList();
		
		manager.getTransaction().commit();
		
		return list;
	}

	public void delete(String lastName, String email) {

		User user = null;

		
		manager.getTransaction().begin();
		
		try{
			
			user = (User) manager.createQuery
					("select u from User u where u.lastName=:lastName"
					+ " and u.email =:email").setParameter("lastName", lastName).
					setParameter("email",email).getSingleResult();
			
			manager.remove(user);
			
//		List<Flight> flights = new ArrayList<Flight>();	
		
//		flights = manager.createQuery("select f from flight f where"
//		
//				+ " f.user_id =:value").setParameter(1,user.getId()).getResultList();
		
//		flights = user.getFlights();
//		
//		
//			
//		for(Flight f: flights){
//			
//			for (User u: f.getUsers()){
//				
//				if(u.equals(user)){
//					u = null;
//				}
//				
//			};
//			
//			manager.merge(f);
//		}
//			
//		manager.remove(user);
//			
		}catch(NonUniqueResultException e){
			System.out.println(e.getMessage());
		}catch(NoResultException e){
			
			System.out.println(e.getMessage());
		}finally{
		manager.getTransaction().commit();
		}
	}

	public void update(User user) {
		
		manager.getTransaction().begin();
		
		manager.merge(user);
		
		manager.getTransaction().commit();
		
	}


	
	
	
	
}
