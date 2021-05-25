package com.nttdata.assignment;

import java.util.Comparator;

public class Book implements Comparator<Book>
{

	private int ISBN_no;
	private String name;
	private double price;
	private String AuthorName;
	public Book(int iSBN_no, String name, double price, String authorName) 
	{
		super();
		ISBN_no = iSBN_no;
		this.name = name;
		this.price = price;
		AuthorName = authorName;
	}
	
	public Book()
	{
		
	}

	public int getISBN_no() {
		return ISBN_no;
	}

	public void setISBN_no(int iSBN_no) {
		ISBN_no = iSBN_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	@Override
	public String toString() 
	{
		return "Book [ISBN_no=" + ISBN_no + ", name=" + name + ", price=" + price + ", AuthorName=" + AuthorName + "]";
	}
	
	public int compare(Book b1,Book b2)
	{
		
		// return ((Integer)b1.ISBN_no).compareTo(b2.ISBN_no);//ASC based on ISBN_no
		
		return ((Integer)b2.ISBN_no).compareTo(b1.ISBN_no);//DSC based on ISBN_no
		 

	}
	
	
	
	
	
}
