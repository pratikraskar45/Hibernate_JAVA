package onetomanyuni.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import onetomanyuni.dto.Company;
import onetomanyuni.dto.Employee;

public class Companydao {

	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
	//1-insert the data
	public void savecompany(Company company) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		List<Employee> list=company.getEmployees();
		for(Employee employee:list) {
			entityManager.persist(employee);
		}
		entityManager.persist(company);
		entityTransaction.commit();
		
	}
	//2-Update the data
	public void updatecompany(int id,Company company) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Company company2=entityManager.find(Company.class, id);
		if(company2!=null) {
			entityTransaction.begin();
			company.setId(company2.getId());
			company.setEmployees(company2.getEmployees());
			entityManager.merge(company);
			entityTransaction.commit();
		}else {
			System.out.println("id doesnt exist");
		}
		
	}
	//3-delete 
	public void deletecompany(int id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Company company=entityManager.find(Company.class, id);
		entityTransaction.begin();
		List<Employee> list=company.getEmployees();
		for(Employee employee:list) {
			entityManager.remove(employee);
		}
		entityManager.remove(company);
		entityTransaction.commit();
		
	}
	//4-get details by id
	public void getcompanybyid(int id) {
		EntityManager entityManager=getEntityManager();
		Company company=entityManager.find(Company.class, id);
		System.out.println(company);
		
	}
	//4-get all details 
	
	public void getallcompany() {
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("select c from Company c");
		System.out.println(query.getResultList());
	}
}
