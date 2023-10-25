package manytomanyuni.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//attribute for language 
	private int lid;
	private String name;
	private String origin;
	
	//generate getters and setters for all attribute
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
		
	}
	//generate the tostring method for override 
	@Override
	public String toString() {
		return "Language [lid=" + lid + ", name=" + name + ", origin=" + origin + "]";
	}
	
	
	
	
	

}
