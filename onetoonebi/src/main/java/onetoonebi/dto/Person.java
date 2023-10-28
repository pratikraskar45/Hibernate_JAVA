package onetoonebi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity  //build the database
public class Person {
	
	@Id  //id as a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id auto generated 
	
	//attribute for person
	private int pid;
	private String name;
	private String address;
	
	
	//form aadhar class
	@OneToOne    //build the relation between person and aadhar two tables and passport as a forgin key
	@JoinColumn
	private Aadhar aadhar;
	
	
	//generate getters and setters for all attribute and also aadhar class

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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

	public Aadhar getAadhar() {
		return aadhar;
	}

	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	
    //tostring method for override 
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + ", aadhar=" + aadhar + "]";
	}
	
	
	
	
	

}
