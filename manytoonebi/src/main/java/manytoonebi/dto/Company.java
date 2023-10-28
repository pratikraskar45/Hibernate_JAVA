package manytoonebi.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity  //for Database
public class Company {
	@Id  //id as a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto generated id
	//attribute for company
	private int cid;
	private String name;
	private String address;
	
	@OneToMany (mappedBy = "company") //because one company many employee //mapped by bcz delete the employee list of 3rd table
	private List<Employee>list;

	//generate getters and setters for all attribute and also employee class 
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
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

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}
	
	//tostring method for override 

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", name=" + name + ", address=" + address +  "]";//erase the list here for delete 3rd table
	}
	
	
	

}
