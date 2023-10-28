package manytomanybi.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity //for Database
public class Language {
	@Id //id as a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id auto generated
	//attribute for language 
	private int lid;
	private String name;
	private String origin;
	
	@ManyToMany (mappedBy = "list") //many language many person //  mapped by bcz we are remove 4th table from DB for language 
	private List<Person>list;

	//generate getters and setters for all attribute also person class
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

	public List<Person> getList() {
		return list;
	}

	public void setList(List<Person> list) {
		this.list = list;
	}

	//generate to string method for override 
	@Override
	public String toString() {
		return "Language [lid=" + lid + ", name=" + name + ", origin=" + origin + "]";//to delete 4th table erase list
	}
	
	

}
