package lib.app;

import lib.model.Member;
import lib.model.Book;
import lib.model.Ebook;

public class Main {
    public static void main(String[] args) {
        // Test Books
        Book a = new Book("Book1", "author1");
        a.describe();
        Book b = new Book("Book2", "author2", 2005);
        b.describe();
        Book c = new Ebook("Book3", "author3", 2025, 10);
        c.describe();
        
        // Test Members
        Member m1 = new Member("amine", "amine@gmail.com");
        Member m2 = new Member("amine", "amine@gmail.com");
        m1.print_member();
        m2.print_member();
        
        // List of Books
        Book[] books = new Book[3];
        books[0] = a;
        books[1] = c;
        books[2] = b;
        for (Book book : books) {
            book.describe();
            System.out.println("-----");
        }
        // Check static counter
        System.out.println("Total books: " + Book.getCount());


    }
}