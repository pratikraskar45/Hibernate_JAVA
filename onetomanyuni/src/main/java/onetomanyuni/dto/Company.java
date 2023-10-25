package onetomanyuni.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity  //for generate database 
public class Company {
	@Id  //generate  id as a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //generate the id automatically
	
	//attribute for company
	private int id;
	private String name;
	private String address;
	
	@OneToMany
	private List<Employee>employees;  //java.until list
	
	
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





	public String getAddress() {
		return address;
	}





	public void setAddress(String address) {
		this.address = address;
	}





	public List<Employee> getEmployees() {
		return employees;
	}





	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}





	//generate tostring method to override by alt_shift+s
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", address=" + address + ", employees=" + employees + "]";
	}
	
	
	

}
