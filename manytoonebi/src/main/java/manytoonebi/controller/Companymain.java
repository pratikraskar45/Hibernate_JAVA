package manytoonebi.controller;

import java.util.ArrayList;
import java.util.List;

import manytoonebi.dao.Companydao;
import manytoonebi.dto.Company;
import manytoonebi.dto.Employee;

public class Companymain {
	
	public static void main(String[] args) {
		
		//*1-save company and employee*//
		
		Company company=new Company();
		company.setName("Accentur");
		company.setAddress("Mumbai");
			
		Employee e1=new Employee();
		e1.setName("vishal");
		e1.setPhone(1564884);
		
		Employee e2=new Employee();
		e2.setName("jeevan");
		e2.setPhone(75285545);
		
		List<Employee>list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		
		
		company.setList(list);
		e1.setCompany(company);
		e2.setCompany(company);
			
		
		Companydao companydao=new Companydao();
//		companydao.savecompany(company);
		
		
		
		//*2-update company*//
		
//		company.setName("Wipro");
//		company.setAddress("Banglor");
		
//		companydao.updatecompany(1, company);

		
		
		//*3-delete by id company*//
		
//		companydao.deletecompany(2);
		
		//*4-get company by id*//
		
//		companydao.getcompanybyid(1);
		
		
		
		//*5-get all person*//
		companydao.getallcompany();
		
		
		
		
	}

}
