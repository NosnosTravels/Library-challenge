/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import book.Book;
import book.ISBN;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author M2200478
 */

public class BookService implements BookRepositoryInterface {
    private final List<Book> books = new ArrayList<>();
    
    @Override
    public void save(Book book) {
        books.add(book);
        System.out.println("Book Saved: " + book);
    }

    @Override
    public List<Book> findByIsbn(ISBN isbn) {
        List<Book> retVal = new ArrayList<>();
        for (Book b : books) {
            if(b.getISBN().equals(isbn)) {
                retVal.add(b);
            }
        }
        
        System.out.println("Book not found with ISBN: " + isbn);
        return retVal;
    }
    
    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books);
    }
    
    @Override
    public void update(Book updatedBook) {
        for(int i = 0; i < books.size(); i++) {
            Book existingBook = books.get(i);
            if (existingBook.getISBN().equals(updatedBook.getISBN())) {
                books.set(i, updatedBook);
                System.out.println("Book updated: " + updatedBook);
                return;
            }
        }
        System.out.println("Book not found for update: " + updatedBook.getISBN());
    }

    @Override
    public void deleteByIsbn(ISBN isbn) {
        for (int i =0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(isbn)) {
                books.remove(i);
                System.out.println("Book not found for deletion: " + isbn);
            }
        }
    }

    public Book create(ISBN Isbn, String title, String author, String format) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

