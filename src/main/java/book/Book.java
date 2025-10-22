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

public class Book implements BookInterface{
    private String Title;
    private String author;
    private ISBN isbn;

    public Book(String Title, String author, ISBN isbn) {
        this.Title = Title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String getTitle() {
        return this.Title;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public ISBN getISBN() {
        return this.isbn;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + Title + ", author=" + author + ", isbn=" + isbn + '}';
    }
}


