package manytooneuni.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity    //to generate database 
public class State {
	
	@Id   // generate id as a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //generate the automatically id
	
	
	//attribute for state
	private int id;
	private String name;
	private String language;
	
	//Country class im  unidirection
	@ManyToOne
	private Country country;
	
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	//generate tostring for override method
	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + ", language=" + language + ", country=" + country + "]";
	}
	
	
	
	

}
