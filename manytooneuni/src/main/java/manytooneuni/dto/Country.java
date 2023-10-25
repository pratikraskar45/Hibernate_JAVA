package manytooneuni.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  //to generate database  
public class Country {
	@Id  // generate id as a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //generate the automatically id
	
	//attribute for country
	private int id;
	private String name;
	private String capital;
	
	//generate getters and setters
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
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	//generate tostring for override method
	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", capital=" + capital + "]";
	}
	
	

	
}
