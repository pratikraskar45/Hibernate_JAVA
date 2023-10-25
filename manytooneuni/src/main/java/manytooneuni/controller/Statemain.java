package manytooneuni.controller;

//import java.util.Scanner;
//
//import manytooneuni.dao.Countrydao;
//import manytooneuni.dao.Statedao;
//import manytooneuni.dto.Country;
//import manytooneuni.dto.State;
//
//public class Statemain {
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		Country country=new Country();
//		State state=new State();
//		Countrydao countrydao=new Countrydao();
//		Statedao Statedao=new Statedao();
//		
//		
//boolean check=true;
//		
//		do {
//			System.out.println("1.save Country and state \n 2.update Country and state \n 3.delete Country and state \n 4.get Country and state by id"
//					+ "\n 5.get all Country and state");
//			
//			int choice=scanner.nextInt();
//			
//			switch (choice) {
//			
//			//case1-for insert the data
//			case 1:{
//				System.out.println("enter the person id");
//				int id=scanner.nextInt();
//				System.out.println("enter person name");
//				String name=scanner.next();
//				System.out.println("enter the person address");
//				String address=scanner.next();
//				
//				person.setId(id);
//				person.setName(name);
//				person.setAddress(address);
//				
//				System.out.println("enter the passport id");
//				int pid=scanner.nextInt();
//				System.out.println("enter the passport name");
//				String pname=scanner.next();
//				System.out.println("enter passport address");
//				String paddress=scanner.next();
//				
//				passport.setId(pid);
//				passport.setName(pname);
//				passport.setAddress(paddress);
//				
//				person.setPassport(passport);
//				persondao.saveperson(person);
//			}break;
//			
//			//case2-for update
//			case 2:{
//				System.out.println("enter the person id");
//				int id=scanner.nextInt();
//				System.out.println("enter the updating name");
//				String name=scanner.next();
//				System.out.println("enter the updating address");
//				String address=scanner.next();
//				
//				person.setId(id);
//				person.setName(name);
//				person.setAddress(address);
//				
//				persondao.updateperson(id,person);
//			}break;
//			
//			//case3-for delete
//			case 3:{
//				System.out.println("enter the id");
//				int id=scanner.nextInt();
//				
//				persondao.deleteperson(id);
//			}break;
//			
//			//case4-for get details by id
//			case 4:{
//				System.out.println("enter the id");
//				int id=scanner.nextInt();
//				
//				persondao.getpersonbyid(id);
//			}break;
//			
//			//case5-for get all the details 
//			case 5:{
//				persondao.getallperson();
//			}break;
//
//
//			default:
//				break;
//			}
//		} while (check);
	
		
		
		
		
		
		
		
		
		
		
		
		
		

import manytooneuni.dao.Countrydao;
import manytooneuni.dao.Statedao;
import manytooneuni.dto.Country;
import manytooneuni.dto.State;

public class Statemain {
	public static void main(String[] args) {
		
		Countrydao countrydao=new Countrydao();
		Statedao statedao=new Statedao();
//		//1-save
//		State s1=new State();
//		s1.setName("Maharashtra");
//		s1.setLanguage("marathi");
//		
//		State s2=new State();
//		s2.setName("Gujrat");
//		s2.setLanguage("Gujrati");
//		
//		Country country=new Country();
//		country.setName("India");
//		country.setCapital("delhi");
//		
//		s1.setCountry(country);
//		s2.setCountry(country);
		
//		countrydao.savecountry(country);
//		statedao.savestate(s1);
//		statedao.savestate(s2);
		
		
//		2-update code for state
//		State state=new State();
//		state.setName("Goa");
//		state.setLanguage("English");
//		statedao.updatestate(2, state);
		
		//update code for country
		
//		Country country=new Country();
//		country.setName("America");
//		country.setCapital("washington");
//		countrydao.updatecountry(1, country);
		
		
		//3-delete state  by id
//		statedao.deletestate(2);
		
		//3-delete country by id
		
//		countrydao.deletecountry(2);
		
		
		
		//4-get state by id
//		statedao.getstatebyid(2);
		
		//4-get country   by id
//		countrydao.getcountrybyid(1);
		
		
		
		//5-get all state
		statedao.getallstate();
		
		//5-get all country
		countrydao.getallcountry();
		
		
		
		
		
		
		
		
	}

}
