package manytomanyuni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import manytomanyuni.dto.Language;
import manytomanyuni.dto.Person;

public class Persondao {
	//build the  database
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
		//to perform CRUD operation and saving in database 
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;	
	}
	//CRUD operation start 
	//1-save the person
	public void saveperson(Person person) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		
	}
	//1-save the language 
	public void savelanguage(Language language) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(language);
		entityTransaction.commit();
		
	}
	//2-update the person
	public void updateperson(int pid,Person person) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person2= entityManager.find(Person.class, pid);
		
		if (person2!=null) {
			person.setPid(pid);
			person.setList(person2.getList());
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
			
		} else {
			System.out.println("it is not present");

		}
		}
	//3-delete the person
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
		Query query= entityManager.createQuery("select p from Person p");
		
		System.out.println(query.getResultList());
		
		
	}
	

}

