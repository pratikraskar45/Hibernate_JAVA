package manytomanyuni.controller;

import java.util.ArrayList;
import java.util.List;

import manytomanyuni.dao.Persondao;
import manytomanyuni.dto.Language;
import manytomanyuni.dto.Person;

public class Personmain {
	
	public static void main(String[] args) {
		
		//1-save
//		Person p1=new Person();
//		p1.setName("Siddhi");
//		p1.setAddress("Vaduj");
//		
//		
//		Person p2=new Person();
//		p2.setName("Esha");
//		p2.setAddress("Kolhapur");
//		
//		
//		Language l1=new Language();
//		l1.setName("Marathi");
//		l1.setOrigin("Maharashtra");
//		
//		Language l2=new Language();
//		l2.setName("Hindi");
//		l2.setOrigin("Goa");
//		
//		List<Language>list=new ArrayList<Language>();
//		list.add(l1);
//		list.add(l2);
//		
//		p1.setList(list);
//		p2.setList(list);
//		
//		Persondao persondao=new Persondao();
//		persondao.savelanguage(l1);
//		persondao.savelanguage(l2);
//		persondao.saveperson(p1);
//		persondao.saveperson(p2);
		
		
		//2-update person
//		Person person=new Person();
//		person.setName("Pratik");
//		person.setAddress("Mumbai");
//		person.setName("Siddhi");
//		person.setAddress("Kolhapur");
		
//		Persondao persondao=new Persondao();
//		persondao.updateperson(2, person);
//		persondao.updateperson(1, person);
		
	
		
		
		
		//3-delete person
//		Persondao persondao=new Persondao();
//		persondao.deleteperson(2);
		
		
		
		
		//4- get by id
//		Persondao persondao=new Persondao();
//		persondao.getpersonbyid(1);
		
		
		//5-get all details
		Persondao persondao=new Persondao();
		persondao.getallperson();
		
		
	}

}
