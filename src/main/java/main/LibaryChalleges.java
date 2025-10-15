/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import book.BookFormat;
import book.BookRecord;
import http.HttpService;
import java.io.IOException;
import book.Book;

import staff.Staff;
import staff.Address;
import libary.Libary;

/**
 *
 * @author M2200478
 */
public class LibaryChalleges {

    public static void main(String[] args) throws IOException {
        HttpService.startServer(8081);

//  Staff Object
        Staff staffObj = new Staff();
        staffObj.setFirstname("Harrison");
        staffObj.setLastname("Smith");
        Address address = new Address();
        address.setAddress1("add1");
        address.setAddress2("address2");
        address.setTown("Middlesbrough");
        staffObj.setStaffAddress(address);

//  Displays the book      
        BookRecord newBook = new BookRecord("Name", "stirng", 1233525, BookFormat.EBOOK);
        Book book = new Book("title", "author", 13213123);
        System.out.println(book);

        //Libary Object
        Libary libaryObj = new Libary();
        libaryObj.setLibaryName("Middlesbrough Libary");
        libaryObj.setLocation("Middlesbrough");
        libaryObj.setLibaryID(22445687);
//      System.out.println(libaryObj);
    }

}
