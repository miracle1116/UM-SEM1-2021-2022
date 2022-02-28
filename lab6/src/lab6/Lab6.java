package lab6;

import java.util.Random;
import java.util.Scanner;

public class Lab6 {
//Question1
    public static int trianum(int n){
        int num =0;
        for(int i=1;i<=n;i++){
            num=num+i;
        }return num;
    }
    //Question2
    public static void copy(int n, char c){
        for(int i=0;i<n;i++){
            System.out.print(c);           
        }
    }
    
    //Question3
    public static void reverse(int[]a){
       
        for(int i=9;i>=0;i--){
            System.out.print(a[i]+" ");
        }             
    }
    //Question4
    public static int findGCD(int a, int b){
        int gcd=0;
        for(int i=1; i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0){
                gcd=i;
            }
        }return gcd;             
    }
    
    
    //Question5
    public static boolean mul(int a, int b, int c){
        if(c==a*b)          
        return true;
        else 
            return false;
               
        }
    
    //Question6
    public static boolean isprime(int a){
        int count=0;
        for(int i =1 ;i<=a;i++){
            if(a%i==0){
                count++;
            }
            
            }if(count==2){
                return true;                
        }else return false;
    }
    public static boolean palin(int a){
        int rem=0,number=0,sum=0,temp=0;
        if(isprime(a)==true){
            temp=a;
             while(a > 0)  
        {  
            rem = a%10;  
            sum = sum*10+rem;   
            a = a/10;   
        }if(temp==sum) {
            return true;           
        }
        }
        return false;
    }
    public static boolean emirp(int a){
        if(isprime(a)==true){
            int reverse = 0;  
         while (a != 0)   
        {   
         int digit = a % 10;   
         reverse = reverse * 10 + digit;  
         a= a/10;  
         }  
        if(isprime(reverse)==true){
            return true;
        }
       }  
        return false;
    }
            
           
    public static void main(String[] args) {
        /*//Question 1
        for(int i=1;i<=20;i++){
            System.out.print(trianum(i)+" ");
        }System.out.println("");*/
        
        
        //Question2
       
        for(int i=1;i<=5;i++){           
            copy((trianum(5)-trianum(i))/2, ' ');
            copy(trianum (i),'i');
            System.out.println();
        } 
        for(int i=1;i<=5;i++){           
            copy((trianum(5)-trianum(i))/2, ' ');
            copy(trianum (i),'i');
            System.out.println();
        }
         for(int i=5;i>=1;i--){           
            copy((trianum(5)-trianum(i))/2, ' ');
            copy(trianum (i),'i');
            System.out.println();    
        }
        
        /*//Question3
        int []b ={1,2,3,4,5,6,7,8,9,0};
        reverse(b);
        
        //Question4
        System.out.println(findGCD(24,8));
        System.out.println(findGCD(200,625));
        
        //Question5
        Random rand= new Random();
        Scanner scan = new Scanner(System.in);
        int a=0,b=0,c=0,count=0;
        do{
            a=rand.nextInt(13);
            b=rand.nextInt(13);
            System.out.println("Enter negative number to quit.");
            System.out.print(a+" x "+b +" = " );
            c=scan.nextInt();
            if(mul(a,b,c)==true){            
                count++;
            }
        }while(c>=0);
        System.out.println("Number of right " +count);
        
        
        //Question 6
        int counter1 =0,counter2=0;
            for(int i=1 ;;i++){
                if(palin(i)==true){
                    System.out.print(i+" ");
                    counter1++;
                }if(counter1==20){
                    break;
                }                
            }System.out.println("");
             for(int i=1 ;;i++){
                if(emirp(i)==true){
                    System.out.print(i+" ");
                    counter2++;
                }if(counter2==20){
                    break;
                }                
            }*/
        
        
    }
}
    

