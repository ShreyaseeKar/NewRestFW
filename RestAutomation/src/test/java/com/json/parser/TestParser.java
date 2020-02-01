package com.json.parser;

import java.io.File;

public class TestParser {

	
	public static void main(String[]args) {
		
		Employee eobj = new Employee ("Gaurav", 20000, 32);
		
		JsonParser parser = new JsonParser();
		
		parser.marshalling(eobj);
		
		System.out.println("pass");
		
		
		/*String filename = "./employee.json";
		File f = new File(filename);
		
		JsonParser parser = new JsonParser();
		
		Employee m =parser.unmarshalling(f, Employee.class);
		
		System.out.println("name:" + m.getName());
		System.out.println("empNo:" + m.getEmpNo());
		System.out.println("salary:" + m.getSalary());
		System.out.println("pass");*/
	}
}
