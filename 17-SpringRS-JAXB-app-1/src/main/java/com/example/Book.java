package com.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
	}

	private Integer bookId;
	
	private String bookName;
	
	private Double price;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
