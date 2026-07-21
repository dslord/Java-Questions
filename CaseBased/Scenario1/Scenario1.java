// 1. Scenario:
// You are tasked with developing a simple Library Management System in Java. The system should allow users to add books, search for books by title,
// and display all books in the library. Each book has a title, author, and ISBN number.
// Requirements:
// 1. Create a Book class with the following attributes:
//      title (String)
//      author (String)
//      isbn (String)
// 2. Create a Library class that manages a collection of books. The Library class should have the following methods:
//      addBook(Book book): Adds a book to the library.
//      searchByTitle(String title): Searches for a book by its title and returns the book if found.
//      displayAllBooks(): Displays all books in the library.
// 3. Create a Main class to test the functionality of the Library class.

// Question:
// Write the Java code to implement the above scenario. Your code should include the Book class, the Library class, and the Main class. 
// Ensure that the Main class demonstrates adding books, searching for a book by title, and displaying all books.

package CaseBased.Scenario1;

import java.util.Scanner;
import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    Book (String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }
}

class Library {
    ArrayList<Book> collection = new ArrayList<>();

    void addBook (Book book) {
        collection.add(book);
    }

    void searchByTitle (String title) {
        int found = 0;
        for (Book book : collection){
            if (book.title.contains(title)) {
                System.out.println("\nFound the Book : ");
                System.out.println("Title  : " + book.title);
                System.out.println("Author : " + book.author);
                System.out.println("ISBN   : " + book.isbn + "\n");
                found = 1;
                break;
            }
        }

        if (found == 0) {
            System.out.println("Book not found!\n");
        }
    }

    void displayAllBooks () {
        System.out.println("\nAll Books in the library are : ");
        for (Book book : collection) {
            System.out.println("Title  : " + book.title);
            System.out.println("Author : " + book.author);
            System.out.println("ISBN   : " + book.isbn + "\n");
        }
    }
}

public class Scenario1 {
    public static void main (String[] args) {
        Library l = new Library();

        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("Following options : ");
                System.out.println("(1) Add Book");
                System.out.println("(2) Search Book by title");
                System.out.println("(3) Display Books");
                System.out.println("(4) Exit");
                System.out.print("Enter choice : ");
                int choice = in.nextInt();
                in.nextLine();

                if (choice == 4) {
                    System.out.println("\nExiting...\n");
                    break;
                }

                if (choice == 1) {
                    System.out.print("\nEnter book title : ");
                    String title = in.nextLine();

                    System.out.print("Enter book author : ");
                    String author = in.nextLine();

                    System.out.print("Enter book isbn : ");
                    String isbn = in.next();
                    
                    Book b = new Book(title, author, isbn);
                    l.addBook(b);

                    System.out.println("Added book in the library!\n");
                } else if (choice == 2) {
                    System.out.print("\nEnter book title to search : ");
                    String title = in.nextLine();

                    l.searchByTitle(title);
                } else if (choice == 3) {
                    l.displayAllBooks();
                } else {
                    System.out.println("\nWrong choice!!!\n");
                }
            }
        }
    }
}
