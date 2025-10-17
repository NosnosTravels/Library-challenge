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
public class BookRepository implements  BookRepositoryInterface{
//BookRepository book = new BorrowBook();
    //concrete implementation
    Book book = new Book();
    List<Book> books = new ArrayList<>();
    
    for (Book book : books) {
        findByIsbn(ISBN);
        book.save(Book book);
        findAll();
        update(Book book);
        deletebyIsbn(ISBN isbn);
    }
    
    
    @Override
    public void save(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void findByIsbn(ISBN isbn) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void upadte(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deletebyIsbn(ISBN isbn) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
