/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package to_Work_On;

import java.util.Scanner;

/**
 *
 * @author M2200478
 */
public class Menu {
    private static final Scanner sc = new Scanner(System.in);  
        
    public static void Menu(){
            System.out.print("1. Find book by ISBN");
            System.out.print("2. Add book");
            System.out.print("3. Remove book");
            System.out.print("4. list borrowed books");
            System.out.print("0. Exit");
            
            int user_choice = sc.nextInt();
            while (user_choice !=0) {
                if (user_choice == 1){
                    //Search book by ID
                }
                if (user_choice == 2){
                    //Add book
                }
                if (user_choice == 2){
                    //Remove book by ID
                }
                if (user_choice == 4){
                    //List borrowed books
                }
                if (user_choice == 0) {
                    System.exit(0);  
                }
            }
            
            
            
        }
}
