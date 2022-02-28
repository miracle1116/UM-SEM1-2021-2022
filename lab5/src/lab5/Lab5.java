package lab5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab5 {
    
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        /*//Question 1
        System.out.print("Enter the number of student: ");
        int n = scan.nextInt();
        int sum=0;
        int []score = new int [n];
        for(int i = 0 ; i<n;i++){
            score[i]=rand.nextInt(101);
            sum += score[i];
        }
        for(int j = 0;j<n-1;j++){
            for(int a = 0; a<n-1;a++){
                if(score[a]>score[a+1]){
                int hold = score[a+1];
                score[a+1] = score[a];
                score[a]= hold;                
            }
        }
    }   System.out.println(Arrays.toString(score));
        System.out.println("The lowest score " + score[0]);
        System.out.println("The highest score "+ score[n-1]);
        System.out.println("Average: "+ sum/n);
        
        
        //Question 2
        int []number =new int [10];
        int i,j;
        for( i = 0 ;i<10 ;i++){
            number[i]=rand.nextInt(21);
        }
        for(i=0;i<10;i++){      
            for( i = 0 ;i<10 ;i++){            
                for( j = 0 ;j<10 ;j++){                
                    if(number[i]==number[j]&&i!=j){
                    number[j]=rand.nextInt(21);                   
                }
            }         
        }}System.out.println(Arrays.toString(number));*/
     
        
       /*//Question 3
        System.out.print("Enter the number of workers: ");
        int worker = scan.nextInt();
        int hours=0;
        int [] hour = new int [worker];
        int [][] working = new int [worker][7];
        for(int i = 0;i<worker;i++){
            for(int j =0;j<7;j++){
                working[i][j]=rand.nextInt(8)+1;
                hours =hours+ working[i][j];
            }
        }System.out.println("Total hours: " +hours);
        for(int g = 0;g<worker;g++){
            for(int h =0;h<7;h++){
                hour[g]=hour[g]+working[g][h];
              
            }System.out.println("Employee "+(g+1)+" working hours is: "+hour[g]);
                          
        }
        
        
        
        //Question 4
        int [][]matrix = new int[3][3];
        int count=0;
        System.out.println("Matrix before rotate");        
        for(int d =0; d<3;d++){
            for(int e =0; e<3;e++){
                matrix[d][e]=rand.nextInt(10)+1;
                System.out.print(matrix[d][e]+" ");
                count++;         
            }if(count%3==0){
                System.out.println();
            }
        }System.out.println("");
        System.out.println("Matrix after rotate 90 degree");
        for(int d=0; d<3;d++){
            for(int e =2; e>=0;e--){
                System.out.print(matrix[e][d]+" ");
                count++;         
            }if(count%3==0){
                System.out.println();         
    }
        }
        
        //Question 5
        
        int []ques5 = new int [20];
        int count5 =1;
        boolean haha =false;
        System.out.println("20 random number");
        for(int i=0; i<20;i++){
            ques5[i]=rand.nextInt(101);                    
        }
        System.out.println(Arrays.toString(ques5));
        for(int f=0; f<19;f++){
            for(int j=0; j<19;j++){
                if(ques5[j]<ques5[j+1]){
                int hold = ques5[j+1];
                ques5[j+1]=ques5[j];
                ques5[j] = hold;              
            }                    
}
        }
         System.out.println("Random number in decending order: ");
         System.out.println(Arrays.toString(ques5));
         System.out.print("Enter a number to found: ");
         int findnum = scan.nextInt();
         for(int i=0; i<20;i++){
            if(ques5[i]==findnum){
                System.out.println(findnum +" found");
                haha=true;
                break;
            }count5++;
        }if(haha==true){
            System.out.println("Linear search - "+count5+" loop(s)" );
        }else
            System.out.println("Number not found");
        int low=19,high=0,count55=1;
        int middle;
        while(low>=high){
            middle=(low+high)/2;
            if(findnum==ques5[middle]){
                   System.out.println(findnum+" found");
                   break;
            }else if(findnum<ques5[middle]){
                high=middle+1;
            }else{
                low=middle-1;}
            count55++; 
        }
        System.out.println("Binary search - "+count55+" loop(s)" );
        
        */
        //Question 6
        System.out.print("Enter a number of row for pascal triangle:");
        int row = scan.nextInt();
        int[][] pas = new int[row][row];        
        for(int i=0;i<row;i++){
            pas[i][0]=1;
            
        } 
         for(int i=1;i<row;i++){
            for(int j=1;j<row;j++){
                pas[i][j]=pas[i-1][j] + pas[i-1][j-1];                          
            }
        }
         for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
              
                    System.out.printf("%-3d",pas[i][j]);
                } System.out.println("");           
}

    }
}
