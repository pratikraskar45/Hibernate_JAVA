package manytooneuni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import manytooneuni.dto.Country;


public class Countrydao {
	
	//for database build
		public EntityManager getEntityManager() {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
			//to perform CRUD operation
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			return entityManager;
			
		}
		
		//1-create or insert the data
		public void savecountry(Country country) {
			EntityManager entityManager=getEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(country);
			entityTransaction.commit();
			
		}
		//2-update state
		public void updatecountry(int id,Country country) {
			EntityManager entityManager=getEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			Country country2= entityManager.find(Country.class, id);
			
			if (country2!=null) {
				country.setId(id);
				entityTransaction.begin();
				entityManager.merge(country);
				entityTransaction.commit();
				
			} else {
				System.out.println("id does not present");

			}
			
		}

		//3-delete state
		public void deletecountry(int id) {
			EntityManager entityManager=getEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			Country country= entityManager.find(Country.class, id);
			
			if (country!=null) {
				entityTransaction.begin();
				entityManager.remove(country);
				entityTransaction.commit();
				
			} else {
				System.out.println("id does not present");

			}	
		}
	
		//4-get by id
		public void getcountrybyid(int id) {
			EntityManager entityManager=getEntityManager();
			Country country= entityManager.find(Country.class, id);
			
			System.out.println(country);
		}
		
		 //5-get all details by  to JPQl-java persistence query language 
		public void getallcountry() {
			EntityManager entityManager=getEntityManager();
			Query query= entityManager.createQuery("select c from Country c");
			
			System.out.println(query.getResultList());
			
			
		}
	

	}



