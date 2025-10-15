/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package book;



/**
 *
 * @author M2200478
 */
public class BookRecord {
    private String BookTitle;
    private String address;
    private int ISBN;
    private BookState bookState;
    private BookFormat bookFormat;
    
    public BookRecord(String BookTitle, String address, int ISB0N, BookFormat bookFormat) {
        this.BookTitle = BookTitle;
        this.address = address;
        this.ISBN = ISBN;
        this.bookFormat = bookFormat;
        this.bookState = BookState.AVAILIBLE;        
    }

    @Override
    public String toString() {
        return "BookRecord{" + "BookTitle=" + BookTitle + ", address=" + address + ", ISBN=" + ISBN + ", bookState=" + bookState + ", bookFormat=" + bookFormat + '}';
    }

    
     
}
