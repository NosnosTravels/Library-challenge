/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

import java.util.Scanner;
/**
 *
 * @author M2200478
 */
public class Book {
private String title;
private String author;
private int isbn;
    
    public Book (String conTitle, String author, int isbn) { // constructor 
        this.title = conTitle; 
        this.author = author; 
        this.isbn = isbn;
    }
    
    /**
     *
     */
    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", isbn=" + isbn + '}';
    }

} 


