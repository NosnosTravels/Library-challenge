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
    public Book findByIsbn(ISBN isbn) {
        for (Book b : books) {
            if(b.getISBN().equals(isbn)) {
                return b;
            }
        }
        System.out.println("Book not found with ISBN: " + isbn);
        return null;
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
}

