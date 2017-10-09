package com.airline.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.airline.entity.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
//		User user = new User("ivan", "hu@", "cerveau");
		
//		manager.merge(user);
		
//		manager.getTransaction().commit();
		
		List<User> rowList = (List<User>) manager.createQuery("SELECT c from User c WHERE c.name=:name", User.class).setParameter("name", "ivan").getResultList();
		
		System.out.println(rowList.toString());
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
		for(User u: rowList){
			System.out.println(u.toString());			
		}
		
	}

}
