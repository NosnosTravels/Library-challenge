/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import book.Book;
import book.ISBN;

/**
 *
 * @author M2200478
 */
public interface BookRepositoryInterface {
    
    void save(Book book);
    void findByIsbn(ISBN isbn);
    void findAll();
    void upadte(Book book);
    void deletebyIsbn(ISBN isbn);
}
