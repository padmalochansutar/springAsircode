package com.example.response;

public class QuoteResponseApi {
	
	private Integer bookId;
	private String bookName;
	
	private Double bookPrice;

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

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "QuoteResponseApi [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	

}
