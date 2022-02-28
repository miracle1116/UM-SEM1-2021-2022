package lab8;

import java.util.Random;

public class Number {
    private int[]a;private int[]a1;private int[]a2;
    private int evenNumber;
    private int primeNum;
    private int maxNum;
    private int minNum;
    private int average;
    private int squareNum;
    
    public static void evenNum(int[]num){
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                System.out.print(num[i]+" ");
            }
        }
    }
    
    public static void primeNum(int []num){
        int counter=0;
         for(int i=0;i<num.length;i++){
             for(int j=1;j<=num[i];j++){
             if(num[i]%j==0){
                 counter++;
               }
             }
            if(counter==2){
                System.out.print(num[i]+" ");
               
            } counter=0;
          
        }
    }
    
    public static void maxMinNum(int[]num){
         for(int i=0;i<num.length;i++){
              for(int j=0;j<num.length-1;j++){
            if(num[j]>num[j+1]){
                int hold =num[j+1];
                num[j+1]=num[j];
                num[j]=hold;
              }
           }
        }
         System.out.println("The Maximun Number: "+num[num.length-1]);
         System.out.println("The minimun Number: "+num[0]);
    }
    
    public static void average(int[]num){
        int total=0;
         for(int i=0;i<num.length;i++){
            total=total+num[i];                     
        }
        System.out.println("The Average is: "+(total/num.length));       
    }
    
    public static void squareNum(int[]num ){
        System.out.print("The Square Num: ");
        for(int i=0;i<num.length;i++){
            if((int)Math.sqrt(num[i])-(double)Math.sqrt(num[i])==0&&num[i]!=0){
                System.out.print(num[i]+" ");
            }

        }System.out.println("");
    }
    
    
    Random rand =new Random();
    
    public Number(){
        setA();
        System.out.println("");
        System.out.print("The Even Number: ");
        evenNum(a);
        System.out.println("");
        System.out.print("The prime Number : ");
        primeNum(a);
        System.out.println("");
        maxMinNum(a);
        average(a);
        squareNum(a);
       
    }
    
    public Number(int a){
        setA1(a);
        System.out.println("");
        System.out.print("The Even Number: ");       
        evenNum(a1);
        System.out.println("");
        System.out.print("The prime Number : ");
        primeNum(a1);
        System.out.println("");
        maxMinNum(a1);
        average(a1);
        squareNum(a1);
       }
    
    public Number(int a,int b){
        setA2(a,b);
        System.out.println("");

        System.out.print("The Even Number: ");
        evenNum(a2);
        System.out.println("");
        System.out.print("The prime Number : ");
        primeNum(a2);
        System.out.println("");
        maxMinNum(a2);
        average(a2);
        squareNum(a2);
    }

    public void setA() {
        int[] a=new int [10];
        for(int i=0;i<10;i++){
            a[i]=rand.nextInt(101);
            System.out.print(a[i]+" ");
            
        }
        this.a = a;
    }

    public void setA1(int b) {
        int[] a=new int [b];
        for(int i=0;i<b;i++){
            a[i]=rand.nextInt(101);
            System.out.print(a[i]+" ");
        }
        this.a1 = a;
    }

    public void setA2(int b,int c) {
        int[] a=new int [b];
        for(int i=0;i<b;i++){
            a[i]=rand.nextInt(c+1);
            System.out.print(a[i]+" ");
        }
        this.a2 = a;
    }
    
    
}
