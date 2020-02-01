package com.json.parser;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonParser {
	
	static ObjectMapper mapper;
	
	static {
		mapper = new ObjectMapper();
		
	}
public void marshalling(Object obj) {
	try {
		mapper.writeValue(new File("./employee.json"), obj);
		
	}catch(Throwable e) {
		e.printStackTrace();
	}
}

public Employee unmarshalling(File jsonFile, Class<Employee> cls)
{
	Employee readValue = null;
	
	try {
		readValue =mapper.readValue(jsonFile,  cls);
		
		
	}catch (Throwable e) {
		e.printStackTrace();
	}
	return readValue;}
}


