package manytoonebi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity //for a Database
public class Employee {
	@Id  //id as a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id auto generated
	//attribute for employee
	private int id;
	private String name;
	private long phone;
	
	@ManyToOne   //because  many employee in one company
	@JoinColumn  //for join  the cid in employee table
	private Company company;

	
	//generate getters and setters for all attribute and also Company  class 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	//tostring method for override 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", company=" + company + "]";
	}
	
	

}
