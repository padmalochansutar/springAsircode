package com.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConvertor {

	public static void main(String[] args) throws Exception {
		Book book=new Book();
		book.setBookId(101);
	    book.setBookName("spring");//i dont want to come null value in json format we will use at book class level @JsonInclude(value = Include.NON_NULL)
		book.setPrice(450.00);
		//convert book data into json
		ObjectMapper mapper=new ObjectMapper();
		//String json = mapper.writeValueAsString(book);//{"bookId":101,"bookName":"spring","price":450.0}
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(book);//{
//		  "bookId" : 101,
//		  "bookName" : "spring",
//		  "price" : 450.0
//		}
		
		System.out.println(json);
		

	}

}
