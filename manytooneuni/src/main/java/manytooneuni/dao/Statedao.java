package manytooneuni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import manytooneuni.dto.State;

public class Statedao {
	//for database build
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
		//to perform CRUD operation
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
		
	}
	//1-create or insert the data
	public void savestate(State state) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(state);
		entityTransaction.commit();
		
	}
	//2-update state 
		public void updatestate(int id,State state) {
			EntityManager entityManager=getEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			State state2=  entityManager.find(State.class, id);
			
			if (state2!=null) {
				state.setId(state2.getId());
				state.setCountry(state2.getCountry());
				entityTransaction.begin();
				entityManager.merge(state);
			
				entityTransaction.commit();
				}else {
					System.out.println("id does not exixt");
				}

		}
	//3-delete state
	public void deletestate(int id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		State state= entityManager.find(State.class, id);
		
		if (state!=null) {
			entityTransaction.begin();
			entityManager.remove(state);
			entityTransaction.commit();
			
		} else {
			System.out.println("id doesnot exist");

		}
	}
	//4-get by id
	public void getstatebyid(int id) {
		EntityManager entityManager=getEntityManager();
		State state= entityManager.find(State.class, id);
		
		System.out.println(state);
	
	}
	 //5-get all details by  to JPQl-java persistence query language 
	public void getallstate() {
		EntityManager entityManager=getEntityManager();
		
		
	  Query query= entityManager.createQuery("select s from State s");
	  
	  System.out.println(query.getResultList());
		
		
		
		
	}

}
