/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

/**
 *
 * @author M2200478
 */
public class ISBN {
    private String value;
    
    public ISBN(String value) {
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
    
    public boolean equals (Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ISBN isbn = (ISBN) obj;
        return value.equals(isbn.value);
    }
    public int hashCode(){
        return value.hashCode();
    }
}
