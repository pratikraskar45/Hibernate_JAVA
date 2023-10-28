package manytomanybi.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity //to Database
public class Person {
	@Id //id as a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id auto generated
	//attribute for person
	private int pid;
	private String name;
	private String address;
	
	@ManyToMany  //many person many language 
	@JoinTable(joinColumns = {@JoinColumn(name = "pid")},inverseJoinColumns = @JoinColumn(name = "lid"))//join 2 table as fk and first column is pid and 2nd is lid 
	private List<Language>list;


	//generate getters setters for all attribute also language class
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

	

	// generate  tostring  override method
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + ", list=" + list + "]";
	}
	
	
	

}
