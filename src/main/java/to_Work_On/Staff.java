/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package to_Work_On;
import libaryInterfaces.*;
import java.util.Scanner;

/**
 *
 * @author M2200478
 */
//public class Staff {
//private static final Scanner sc = new Scanner(System.in); 
//    private String name;
//    private String id;
//    private String address;
//
//    private void Staff_members(){
//        this.name = name;
//        this.id = id;
//        this.address = address;
//    }
//    
//    private static void Get_staff_name(){
//
//    }


public class Staff implements StaffInterface{
//    private static final Scanner sc = new Scanner (System.in);
    public void StaffInfo(){
        
    }
           
   
    @Override
    public void StaffName() {
       System.out.println("Bob");
    }


    @Override
    public void StaffID() {
        System.out.println("Bob");
    };

    @Override
    public void StaffAddress() {
        System.out.println("17 Pennal Grove");
    }
         
    
}

