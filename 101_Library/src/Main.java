/*
101.1: Book
Let us start with the class Book. 
The class has instance variables 
title for the book title, 
publisher for the name of the publisher, 
and year for the publishing year. 
The title and the publisher are of the type String and the publishing year is represented as an integer.

Now implement the class Book. The class should have the constructor
public Book(String title, String publisher, int year) and methods 
public String title(), public String publisher(), public int year() and public String toString().

101.2: Library
Implement the class Library, with constructor public Library() and methods 
public void addBook(Book newBook) and public void printBooks()

101.3: Search functionality
Add to the class Library the methods 
public ArrayList<Book> searchByTitle(String title), 
public ArrayList<Book> searchByPublisher(String publisher) 
and public ArrayList<Book> searchByYear(int year).
The methods return the list of books that match the given title, publisher or year.

Note: you are supposed to do a method that returns an ArrayList.
Can Use the following skeleton as starting point:

   public ArrayList<Book> searchByTitle(String title) {
     ArrayList<Book> found = new ArrayList<Book>();

     // iterate the list of books and add all the matching books to the list found

     return found;
   }

101.4: Improved search
There are some minor problems with the implemented search functionality. 
One particular problem is that the search differentiates upper and lower case letters. 
 We'd like the search functionality to be case insensitive and not disturbed 
by the extra white spaces at the start or at the end of the search terms. 
We will implement a small helper library StringUtils that will then be used in the Library 
for the more flexible search functionality.

Implement the class StringUtils with a static method
public static boolean included(String word, String searched), 
which checks if the string searched is contained within the string word. 
As described in the previous paragraph, the method should be case insensitive 
and should not care about trailing and ending white spaces in the string searched. 
If either of the strings is null, the method should return false.

Tip: The methods trim and toUpperCase() of the class String might be helpful.

When you have completed the method, use it in the search functionality of the class Library.
*/

public class Main {
    public static void main(String[] args) {
        // test your program here
        
        
    }
}
