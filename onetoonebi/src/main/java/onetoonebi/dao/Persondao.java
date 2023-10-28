package onetoonebi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import onetoonebi.dto.Aadhar;
import onetoonebi.dto.Person;

public class Persondao {
	//to build the Database
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
		//to perform CRUD operation
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
		
	}
	
	//1-save
	public void saveperson(Person person) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Aadhar aadhar=person.getAadhar();
		entityTransaction.begin();
		entityManager.persist(aadhar);
		entityManager.persist(person);
		entityTransaction.commit();
		
	}
	
	
	//2-updating
	public void updateperson(int pid,Person person) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person2= entityManager.find(Person.class, pid);
		
		if (person2!=null) {
			person.setPid(pid);
			person.setAadhar(person2.getAadhar());
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
		} else {
			System.out.println("id is not present");

		}
	}
	//3-delete person
	public void deleteperson(int pid) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person= entityManager.find(Person.class, pid);
		
		if (person!=null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			
		} else {
			System.out.println("id is not present");

		}	
	}
	//4-get person by id
	public void getpersonbyid(int pid) {
		EntityManager entityManager=getEntityManager();
		Person person= entityManager.find(Person.class, pid);
		
		System.out.println(person);	
	}
	//5-get all details by  to JPQl-java persistence query language 
	
	public void getallperson() {
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("select p from Person p");
		System.out.println(query.getResultList());
	}

}
