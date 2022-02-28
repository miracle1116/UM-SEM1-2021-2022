
package lab3;

import java.util.Random;
import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        Random rand = new Random();
      //Question 1//
     int a1 = scan.nextInt();
     int b1 =scan.nextByte();
     String operator = scan.next();
     if(operator.equals("+")){
         System.out.println("sum:"+( a1+b1));
     }else if(operator.equals("-")){
         System.out.println("substract:"+ (a1-b1));
     }else if(operator.equals("*")){
         System.out.println("multiply:"+(a1*b1));
     }else{
         System.out.println("divide: "+ (a1/b1));
     }
     //Question 2//
     
     int d2 = rand.nextInt(6);
     switch(d2){
         case 0:
             System.out.println(d2 +" is zero");
                     break;
         case 1:
         System.out.println(d2+ " is one");
         break;
         case 2:
        System.out.println(d2 +" is two");
        break;
         case 3:
             System.out.println(d2+" is three");
             break;
         case 4:
             System.out.println(d2+" is four");
             break;
         case 5:
             System.out.println(d2+" is five");
             break;
     }
     //Question 3//
        System.out.print("input total sales: ");
     double sales = scan.nextDouble();
     if(sales<=100){
         System.out.printf("commission= " +"%.2f",(sales*0.05));
     }else if(sales>100&&sales<=500){
         System.out.printf("commission= "+"%.2f",(sales*0.075));
     }else if(sales>500&&sales<=1000){
         System.out.printf("commission = "+"%.2f",(sales*0.1));
     }else{
         System.out.printf("commission= "+ "%.2f",(sales*0.125));
     }
    
            //Question 4//
    int w1 = rand.nextInt(6)+1;
    int x1 = rand.nextInt(6)+1;
    int w2 = rand.nextInt(6)+1;
    int x2 = rand.nextInt(6)+1;
    int p1 = w1+w2;
    int p2 = x1+x2;
    if(p1>p2){
        System.out.println("Player 1 win with score: "+p1);
    }else{
        System.out.println("Player2 win with score: "+p2);
    }
    // Question 5//
    System.out.print("a:");
    int a = scan.nextInt();
     System.out.print("b:");
     int b = scan.nextInt();
     System.out.print("c:");
     int c = scan.nextInt();
      System.out.print("d:"); 
      int d = scan.nextInt();
      System.out.print("e:");
      int e = scan.nextInt();
       System.out.print("f:");
       int f = scan.nextInt();
       if(a*d - b*c==0){
           System.out.println("The equation has no solution");
    }else{
       int x = (e*d-b*f)/(a*d-b*c);
       int y =(a*f-e*c)/(a*d-b*c);
           System.out.println("x: "+x);
           System.out.println("y: "+y);
       }
        //Question 6//
        System.out.print("enter radius: ");
        int r = scan.nextInt();
        System.out.print("enter x:");
        int x6 = scan.nextInt();
        System.out.print("enter y:");
        int y6 = scan.nextInt();
        
        double xx6 = Math.pow(x6, 2);
        double yy6 = Math.pow(y6,2);
        double sum = xx6+yy6;
        double length = Math.sqrt(sum);
        if(length<=r){
            System.out.println("The point is inside the circle");
        }
        else{
            System.out.println("The point is outside the circle");
        }

    
            
        }
    }
    

