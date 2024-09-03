/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author aytaj.veyisli
 */
public class Operations {
  
    public static String operations = "Choose the operation: 1-View balance 2-Withdraw money 2-Change PIN"; 
    
    public static void checkID(String id){
        String userID=Users.getID();
        String pin;
        if (userID.equals(id)) {
            System.out.println("Enter PIN");
            Scanner sc = new Scanner(System.in);
            String myPin = sc.nextLine();
            pin = Users.getPIN();
                    
            if (pin.equals(myPin)) {
                for (int i = 0; i < Users.person1.length; i++) {
                if (i==Users.person1.length-2) {
                    break;
                }
                System.out.printf(Users.person1[i] + " ");
                
                    }
                System.out.println(" ");
            
            

                }
            else{
                        System.out.println("PIN ERROR!!!!");
                    }
            
                
            }
        else {
                    System.out.println("ID error");
                }
                
        
            
            
        

        
    }
    
    public static void checkOperations(String num ){
        String selected = num;
        switch(selected){
            case "1":
               Users.getBalance();
            break;
            case"2":
                
                break;
        }
    }
    
    
    public static void viewBalance(){
        System.out.println(Users.getBalance());
    }
    
    public static void WithdrawMoney(){
        System.out.println("Please, enter amount");
        
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int balanceInt = Integer.parseInt(Users.getBalance());
        if (balanceInt<amount || amount==0 || amount==-1) {
            System.out.println("Error amount!!!");
        }
        else{
            int newBalance = balanceInt-amount;
            String strBalance = String.valueOf(newBalance);
            Users.setBalance(strBalance);
            System.out.println("Get your money");
            System.out.println("Your balance: " + Users.getBalance());
            
        }
        
        
    }
    
    
    public static void ChangePin(){
        
    }
    
    
}

                    