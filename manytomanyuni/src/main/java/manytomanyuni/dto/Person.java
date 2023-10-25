package manytomanyuni.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity  //build database 
public class Person {
	
	@Id   //generate id as a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //generate id automatically
	
	//attribute for person
	private int pid;
	private String name;
	private String address;
	
	@ManyToMany
	private List<Language>list;

	
	//generate getters and setters for all attribute also language
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

	public List<Language> getList() {
		return list;
	}

	public void setList(List<Language> list) {
		this.list = list;
	}
	
	//generate tostring method for override 

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + ", list=" + list + "]";
	}
	
}

