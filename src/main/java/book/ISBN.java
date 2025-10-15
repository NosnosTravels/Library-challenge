/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package book;

/**
 *
 * @author M2200478
 */
public record ISBN() {
    private static int isbn;
    
    public ISBN(){
     this.isbn = 66;
    System.out.println(isbn);
    }
}
