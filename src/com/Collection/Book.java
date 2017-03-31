//Create Book having following attributes: Book ID, Title, Author and Price. 
//Create Periodical which has the following additional attributes: Period (weekly, monthly etc...)
//.Add a behavior to modify the Price and the Period of the periodical.
//Display the updated periodical details. 
package com.Collection;

//import java.util.Comparator;

public class Book  {
private int book_id;
private String title;
private String author;
private int price;

public Book()
{

}
public Book(int book_id,String title,String author,int price) {
	    this.book_id=book_id;
	    this.title=title;
	    this.author=author;
	    this.price=price;
	}
public int getBook_id() {
	return book_id;
}
public void setBook_id(int book_id) {
	this.book_id = book_id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String toString(){
	return book_id+" "+title+" "+author+" "+price;
	
}



}
