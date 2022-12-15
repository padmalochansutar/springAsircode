package com.example;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToJavaConvertor {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		JAXBContext context = JAXBContext.newInstance(Book.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object object = unmarshaller.unmarshal(new File("book.xml"));
		Book book=(Book) object;
		System.out.println(book);

	}

}
