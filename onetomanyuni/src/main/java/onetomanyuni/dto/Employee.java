package onetomanyuni.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //for generate database 
public class Employee {
	@Id  //generate  id as a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //generate the id automatically
	
	//attribute for employee
	private int id;
	private String name;
	private String address;
	
	
	
	
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
	
	
	//generate tostring method to override by alt_shift+s 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	

}
