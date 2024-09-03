/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author aytaj.veyisli
 */
public class Users {
    public static String[] person1 = {"1", "Aytaj", "Veyisli", "5000", "a123"};

    public static String getID(){
        return person1[0];
    }
    
    public static String getPIN(){
        return person1[person1.length-1];
    }
    public static String getBalance(){
        return person1[person1.length-2];
    }
    public static void setBalance(String str){
        Users.person1[person1.length-2] = str;
    }
    
    
}
