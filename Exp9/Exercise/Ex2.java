// Create a Library Book Management program where the book ISBN is declared as final 
// and cannot be changed once assigned. Display the book's ISBN, title, author, and price.
package Exp9.Exercise;

class Book {
    final String isbn;
    String title;
    String author;
    double price;

    Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("ISBN   : " + isbn);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Book b = new Book("978-93-12345-67-8", "Java Programming", "James Gosling", 599);
        b.display();
    }
}