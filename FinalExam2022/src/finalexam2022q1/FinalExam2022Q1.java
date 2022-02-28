package finalexam2022q1;
// U2102781 student

import java.util.Random;


public class FinalExam2022Q1 {

    public static void main(String[] args) {
        Random rand = new Random();
        double num1= rand.nextDouble()*201+100;
        double num2= rand.nextDouble()*201+100;
        double num3= rand.nextDouble()*201+100;
        System.out.printf("%s%.2f%s%.2f%s%.2f","3 random price values : ",num1," ",num2," ",num3);
        System.out.println("");
        
        
        int i=0;
        System.out.print("5 random even-numbered years : ");
        while(i<=4){
            int year = rand.nextInt(41)+1990;
            if(year%2==0){
                System.out.print(year+" ");
                i++;
            }
        }
         System.out.println("");
     
         System.out.print("Car Plate Number: ");
         int number=rand.nextInt(90000)+10000;
        System.out.print(number);     
        int a=rand.nextInt(90-65+1)+65;
         int b=rand.nextInt(90-65+1)+65;
        System.out.print((char)a);
        System.out.print((char)b);
        System.out.println("");
        
        
        char[]word=new char[8];
        for(int j=0;j<word.length;j++){
            int character = rand.nextInt(58)+65;
            if(character>90&&character<97){
                j--;
                continue;
            }
            char c=(char)character;
            word[j]=c;         
        }
        System.out.print("Random word: ");
        for(int j=0;j<word.length;j++){
            System.out.print(word[j]);      
        }
    }
    
}
