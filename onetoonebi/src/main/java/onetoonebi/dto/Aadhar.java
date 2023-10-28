package onetoonebi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity  //build the database
public class Aadhar {
	
	@Id  //id as a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //id is auto generated 
	
	//attribute for aadhar
	private int id;
	private String name;
	private String address;
	
	//from person class
	@OneToOne (mappedBy = "aadhar")   //build the relation between person and aadhar two tables and passport as a forgin key
	private Person person;
	
	//generate getters and setters for all attribute and also person class

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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
    //generate the tostring method for override
	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", name=" + name + ", address=" + address +  "]";  // erase the person reference
	}
	
	
	
	

}
