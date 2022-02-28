
package luckyhotel;

import java.util.Scanner;

public class customer {
     public static void customerpage(){
            Scanner scan =new Scanner(System.in);
            System.out.println("========Customer Login Phase========");
            System.out.println("");
            System.out.print("Please Enter your email: ");
            String email=scan.nextLine();
            System.out.print("Please enter your password: ");
            String password=scan.nextLine();
            System.out.println("");
            boolean checkid=Method.checkid(email, password);
            if(checkid==true){
            System.out.println("========Welcome Back========");
            System.out.println("List of rooms");
            // here just sample
            System.out.println("#1 A001");
            System.out.println("#2 A002");
            System.out.println("#3 A003");
            System.out.println("#4 A004");
            System.out.println("#5 A005");
            System.out.println("");
            //Here can add code while the room is added
            System.out.println("A. Booking List");
            System.out.println("B. Transaction History");
            System.out.println("C. Logout");
            System.out.println("D. Reset Password");
            System.out.print("What do you want to do now? Please Select [1-5] [A-D]");
            String choice = scan.nextLine();
        }
     }
}
