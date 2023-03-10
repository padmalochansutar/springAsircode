package com.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JavaToJaxbConvertor {

	public static void main(String[] args) throws Exception {
		Book book=new Book();
		book.setBookId(101);
		book.setBookName("spring");
		book.setPrice(450.00);
		//convert book data into xml
		
		JAXBContext context=JAXBContext.newInstance(Book.class);
		Marshaller marshaller=context.createMarshaller();
		marshaller.marshal(book, System.out);
	}

}
