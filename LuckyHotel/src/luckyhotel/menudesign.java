/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luckyhotel;

import java.util.Scanner;

/**
 *
 * @author yiqua
 */
class menudesign {
        public static void mainpage(){
        Scanner scan =new Scanner(System.in);
        System.out.println("========Welcome to Lucky Hotel========");
        System.out.println("");
        System.out.println("A. Register");
        System.out.println("B. Login as Admin");
        System.out.println("C. Login as Customer");
        System.out.println("D. Forgot Password");
        System.out.print("What is your request now? Please select [A-D]: ");
        String userinputinMainpage=scan.next();
        System.out.println("");
        switch(userinputinMainpage){
            case"A":{
                
            }
            case"B":{
                
            }
            case"C":{
                customer.customerpage();
            }
            case "D":{
                
            }
                           
        }
    }
       
}
