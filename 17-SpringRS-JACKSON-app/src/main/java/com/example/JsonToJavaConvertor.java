package com.example;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConvertor {
	
	public static void main(String[] args) throws Exception {
		File file=new File("Book.json");
		ObjectMapper mapper=new ObjectMapper();
		Book book = mapper.readValue(file, Book.class);
		System.out.println(book);
	}

}
