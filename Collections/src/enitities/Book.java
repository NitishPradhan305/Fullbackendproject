package enitities;

import java.util.Comparator;

public class Book implements Comparator<Book>{
int bookId;
String bookName;
String author;
boolean isAvailable;
public Book(int bookId, String bookName, String author, boolean isAvailable) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.author = author;
	this.isAvailable = isAvailable;
}


public int getBookId() {
	return bookId;
}


public void setBookId(int bookId) {
	this.bookId = bookId;
}


public String getBookName() {
	return bookName;
}


public void setBookName(String bookName) {
	this.bookName = bookName;
}


public String getAuthor() {
	return author;
}


public void setAuthor(String author) {
	this.author = author;
}


public boolean isAvailable() {
	return isAvailable;
}


public void setAvailable(boolean isAvailable) {
	this.isAvailable = isAvailable;
}


@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", isAvailable=" + isAvailable
			+ "]";
}
@Override
public int compare(Book b1, Book b2) {
	
	return b1.author.compareTo(b2.author);
}


}
