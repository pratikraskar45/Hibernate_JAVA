package onetomanyuni.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import onetomanyuni.dao.Companydao;
import onetomanyuni.dto.Company;
import onetomanyuni.dto.Employee;

public class Companymain {
	public static void main(String[] args) {

	Scanner scanner= new Scanner(System.in);
	
	Employee employee=new Employee();
	Company company=new Company();
	Companydao companydao=new Companydao();
	
	boolean check=true;
	do {
		System.out.println("1.save company and  \n 2.update company \n 3.delete company \n 4.get company by id"
				+ "\n 5.get all company");
		int choice=scanner.nextInt();
		
		switch (choice) {
		
		//case1-for insert the data
		case 1:{
			System.out.println("enter the company name");
			String name=scanner.next();
			System.out.println("enter the company address");
			String address=scanner.next();
			
			company.setName(name);
			company.setAddress(address);
			
			
			
			System.out.println("enter the employee name");
			String ename=scanner.next();
			System.out.println("enter employee address");
			String eaddress=scanner.next();
			
			employee.setName(ename);
			employee.setAddress(eaddress);
			
			List<Employee> list=new ArrayList<Employee>();
			list.add(employee);
			
			
			company.setEmployees(list);
			companydao.savecompany(company);
		}break;
		
		
		
		//case2-for update
		case 2:{
			
			System.out.println("enter the company id");
			int id=scanner.nextInt();
			
			System.out.println("enter the updating company  name");
			String name=scanner.next();
			System.out.println("enter the updating company address");
			String address=scanner.next();
			
			company.setName(name);
			company.setAddress(address);
			
			companydao.updatecompany(id, company);}break;
			
			
			//case3-for delete
		case 3:{
			System.out.println("enter the id");
			int id=scanner.nextInt();
			
			companydao.deletecompany(id);
		}break;
	
		
		//case4-for get details by id
		case 4:{
			System.out.println("enter the id");
			int id=scanner.nextInt();
			
			companydao.getcompanybyid(id);
		}break;
		
		
		//case5-for get all the details 
		case 5:{
			companydao.getallcompany();
		}break;
		
		
		
	
		default:
			break;
		}
		
		
		
		
	} while (check);
	
	




























             //OR

//import java.util.ArrayList;
//import java.util.List;
//
//import onetomanyuni.dao.Companydao;
//import onetomanyuni.dto.Company;
//import onetomanyuni.dto.Employee;
//
//public class Companymain {
//
//	public static void main(String[] args) {
//		Company company=new Company();
//		Employee employee=new Employee();
//		Companydao companydao=new Companydao();
		//1-for save
//		company.setName("IBM");
//		company.setAddress("Mumbai");
//		
//		Employee e1=new Employee();
//		e1.setName("ram");
//		e1.setAddress("bangalore");
//		
//		Employee e2=new Employee();
//		e2.setName("vikki");
//		e2.setAddress("chennai");
//		
//		List<Employee> list=new ArrayList<Employee>();
//		list.add(e1);
//		list.add(e2);
//		
//		company.setEmployees(list);
//		
//		companydao.savecompany(company);


		
		//2-for update
//		company.setName("wipro");
//		company.setAddress("banglor");
//		
//		companydao.updatecompany(4, company);


		
		//3-delete
//		companydao.deletecompany(5);
		
		//4-getbyid
//		companydao.getcompanybyid(4);
		//5-getall
//		companydao.getallcompany();
//		
//		
//		
	}
}
