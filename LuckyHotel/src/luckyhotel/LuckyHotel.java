package luckyhotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LuckyHotel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //USER LOGIN
        /*String a="",b="";   
        System.out.print("Enter email: " );
        a=scan.nextLine();
        System.out.print("Enter password: ");
        b= scan.nextLine();
        while(Method.checkidUser(a, b)==false){
           System.out.print("Please re-enter your email: ");
           a=scan.nextLine();
           System.out.print("Please re-enter your password: ");
           b= scan.nextLine();
        }
        if(Method.checkidUser(a, b)==true){
              System.out.println("Login successful!! ");
              //add code to proceed to next page                           
    }
        //ADMINLOGIN
        String c="",d="";   
        System.out.print("Enter adminID: " );
        c=scan.nextLine();
        System.out.print("Enter password: ");
        d= scan.nextLine();
        while(Method.checkidAdmin(c, d)==false){
           System.out.print("Please re-enter your adminID: ");
           c=scan.nextLine();
           System.out.print("Please re-enter your password: ");
           d= scan.nextLine();
        }
        if(Method.checkidAdmin(c, d)==true){
              System.out.println("Login successful!! ");
              //add code to proceed to next page                           
    }
 */

    // Method.displayRoom();
     Method.addNewRoom("A001", "107");
     
    }
    
}
