package lab.pkg4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Lab4 {

    public static void main(String[] args) { 
     Scanner scan = new Scanner(System.in); Random rand = new Random();
      /* //Question 1       
        System.out.print("Enter a value: ");
        int num = scan.nextInt();
                System.out.println("");
        System.out.print("The factor are: " );        
        for(int i=1;i<=num;i++){
            if(num%i==0){
              System.out.print( i + ", ");
            }
        }System.out.println("");
        
        //Question 2
        System.out.print("Enter a value: ");
        int n = scan.nextInt();
        int sum =0;
        for(int i =1;i<=n;i++){
            sum +=i;
        }System.out.println("The sum is: "+ sum);
        
       ///Question 3   
      double sum =0; int counter=0;
      double score=0;double sumsum=0;
      ArrayList<Integer>al=new ArrayList<Integer>();
      while(score>=0){           
           System.out.print("Enter a score ( Negative score to quit): ");
           score= scan.nextDouble();           
        if(score<0)
              break;
        sumsum+=Math.pow(score,2);
        sum+=score;  al.add((int)score);
        counter++;       
        } 
      Collections.sort(al);
        System.out.println(sum);
        System.out.println("Minimum score: "+ al.get(0));
        System.out.println("Maximum score: " + al.get(counter-1));
        System.out.printf("Average score: " + "%.2f", (sum/counter));
        double n2 =Math.pow(sum,2);
        double upper =sumsum-(n2/counter);
        double all = upper/(counter-1);
        double srd = Math.sqrt(all);
        System.out.println();
        System.out.printf("Standard deviation: "+"%.2f", srd);*/
        
       
      /*  //Question 3
        System.out.print("Enter the years: ");
        int years = scan.nextInt();
        System.out.print("Enter the day: ");
        int day = scan.nextInt();
        int daybeforeMay;
        int daybeforeAugust;
        if(years%4==0){
            daybeforeMay=31+29+31+30;
            daybeforeAugust= 31+29+31+30+31+30+31;
        }else{ 
            daybeforeMay=31+28+31+30;
            daybeforeAugust= 31+28+31+30+31+30+31;                 
        }int daybeginMay= (daybeforeMay%7+day)%7;
        int daybeginAugust = (daybeforeAugust%7+day)%7;System.out.println();
        System.out.println("Calendar fo May "+years);
          System.out.println("-----------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
          for (int i = 0; i < daybeginMay; i++) {
                System.out.print("    ");
            }for (int i = 1; i <= 31; i++)
            {
                if (i < 10) {
                    System.out.print("   " + i);
                } else {
                    System.out.print("  " + i);
                }
                if ((i + daybeginMay) % 7 == 0) {
                    System.out.println();
                }
            } System.out.println();System.out.println();
              System.out.println("Calendar fo August "+years);
            System.out.println("-----------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
          for (int i = 0; i < daybeginAugust; i++) {
                System.out.print("    ");
            }for (int i = 1; i <= 31; i++)
            {
                if (i < 10) {
                    System.out.print("   " + i);
                } else {
                    System.out.print("  " + i);
                }
                if ((i + daybeginAugust) % 7 == 0) {
                    System.out.println();
                }
            }System.out.println();*/
        
        
                      
     /*//Question5
     
     int p1 =0,sum1=0;
     int p2=0,sum2=0;
     while(sum1<100&&sum2<100){
         p1=rand.nextInt(6)+1;
         sum1+=p1;         
         while(p1==6){
           p1=rand.nextInt(6)+1;        
         sum1+=p1;}
         p2=rand.nextInt(6)+1;
         sum2+=p2;
         while(p2==6){
           p2=rand.nextInt(6)+1;     
           sum2+=p2 ;
     }System.out.print(p1+" ");System.out.print(p2+" ");}if(sum1>100){
         System.out.println("Player 1 win");
     }else{
         System.out.println("Player 2 win");
     }System.out.println(sum1);
        System.out.println(sum2);  
     
     //Question6
     int integer=rand.nextInt();
     int count=0;
     while(integer<0){
         integer=rand.nextInt();
     }String number=Integer.toString(integer);
     for(int i=0;i<number.length();i++){
         count++;
     }System.out.println(integer);
        System.out.println("The number of digit : "+ count);*/
     
     /*//Question7
        System.out.print("Enter the principal: ");
        double p = scan.nextDouble();
        System.out.print("Enter yearly interest rate in %: ");
        double i = scan.nextDouble();
        System.out.print("Enter total number of month(s): ");
        double N =scan.nextDouble();
        //monthly payment
        double left = p*(i/1200);
        double inside=1+(i/1200);
        double right = (1-Math.pow(inside,-N));
        double m= left/right;
        //principal
        double principal =0;
        //interest
        double idue =0;
        //unpaid
        double remain = 0;
        double totalin=0;
        
        System.out.println("Month"+ "          "+"Monthly payment"+ "           "+"Principal"+"          "+"Interest"+"         "+"Unpaid balance"+"         "+"Total Interest");      
        for(int a =1;a<=N;a++){
            if(a>=10){System.out.print(a+"                      ");}
            else {System.out.print(a+"                       ");}
            System.out.printf("%.2f",m);
            principal = m *(Math.pow((1+i/1200),-(1+N-a)));
            System.out.printf("              "+"%.2f",principal);
            idue = m-principal;
            if(idue<10)
            System.out.printf("              "+"%.2f",idue);
            else System.out.printf("             "+"%.2f",idue);
            remain = (idue/(i/1200))-principal;
            if(remain<10)System.out.printf("                   "+"%.2f",remain);
            else if(remain<1000)System.out.printf("                 "+"%.2f",remain);
            else System.out.printf("                "+"%.2f",remain);
            totalin += idue;
            if(totalin<100) System.out.printf("                  "+ "%.2f",totalin);
            else System.out.printf("                 "+ "%.2f",totalin);
            System.out.println("");
            
            }*/
         
        
     /*//Question 8
      int i =0;
       int num =0;
       int n8= rand.nextInt(101);
        System.out.println(n8);
       String  primeNumbers = "";
       int count = 0;
       olige:{ 
       for (i = 1; ; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     primeNumbers = primeNumbers + i + " ";
             count++;           
	  }  if (count==n8){
          break olige;                        
       }                         
}
    } System.out.println(primeNumbers); */
    }
        }

    


