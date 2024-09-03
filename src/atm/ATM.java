/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author aytaj.veyisli
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         
         
         
         while(true){
             System.out.println("WELCOME!");
             
             System.out.println("Enter your ID:");
             Scanner scanner = new Scanner(System.in);
         
             String id = scanner.nextLine();
             
             
             Operations.checkID(id);
             System.out.println(Operations.operations);
             
             Scanner sc2 = new Scanner(System.in);
             String withdraw = sc2.nextLine();
             
             
             Operations.WithdrawMoney();
             
             
             
             
             
         }
         
         
          
         
         
         
          
         
         
    }
    
}
