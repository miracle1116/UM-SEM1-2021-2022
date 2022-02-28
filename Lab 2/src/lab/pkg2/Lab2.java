
package lab.pkg2;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Lab2 {

    
    public static void main(String[] args) {
       //Question 1 // 
       Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        double Fahrenheit = scan.nextDouble();
        double celcius = (Fahrenheit - 32)/1.8;
        System.out.printf("%.2f",celcius);
        
        
        //Question 2//
        System.out.print("Enter the price: ");
        long P = scan.nextLong();
        System.out.print("Down Payment: ");
        double D= scan.nextDouble();
        System.out.print("Interest Rate: ");
        int R = scan.nextInt();
        System.out.print("Loan Duration in Years: ");
        int Y = scan.nextInt();
        double M;
        M =(P-D)*(1+R*Y/100)/(Y *12);
        System.out.printf("Monthly Payment: " + "%.2f",M);
        
       
        //Question 3//
         
        int a = rand.nextInt(41)+10;
        int b = rand.nextInt(41)+10;
        int c = rand.nextInt(41)+10;
        System.out.println(a +" "+b+" "+c);
        System.out.println(a+b+c);
        double d = ((a+b+c)/3.0);
        System.out.printf("%.2f",d);
        
        
       // Question 4//
       System.out.print("Input seconds: ");
        int second = scan.nextInt();
        int second1= second%60;
        int minute=((second-second1)/60)%60;
        int hours=(second-second1-minute*60)/3600;
        
        System.out.println("Time:"+ hours +" hours "+minute+" minutes "+second1+" seconds");
      
        
       //Question5//
       int number = rand.nextInt(10001);
        int sum=0;
        System.out.println(number);
        while (number >0){
            sum=sum+number%10;
            number=number/10;

        }
        System.out.println(sum);
       
        
       //Question 6//
        System.out.print("Enter the amount of water in gram: ");
        double water = scan.nextDouble()/1000.0;
        System.out.print("Enter the initial temperature of water in Farenheit: ");
        double I = scan.nextDouble();
        System.out.print("Enter the final temperature of water in Farenheit: ");
        double F= scan.nextDouble();
        double energy = water*(((F-32)/1.8)-((I-32)/1.8))*4184;
        System.out.printf("The energy needed is " + "%1.6f%s%s",energy/1000000 ,"e","06");
        

       
       
        
       
        
        
        
        
    }
    
}
