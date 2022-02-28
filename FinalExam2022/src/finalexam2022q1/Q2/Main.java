
package finalexam2022q1.Q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String []args){
        Diving[] player=new Diving[5];
        String name, country;
        double []rating=new double [3];
        double[][] score= new double[3][7];
        double [] all= new double[5];
         try{
             int i=0;
            Scanner scan= new Scanner(new FileInputStream("diving.txt"));
            while(scan.hasNextLine()){
                name=scan.nextLine();
                country=scan.nextLine();
                score[0][0]=scan.nextDouble();
                score[0][1]=scan.nextDouble();
                score[0][2]=scan.nextDouble();
                score[0][3]=scan.nextDouble();
                score[0][4]=scan.nextDouble();
                score[0][5]=scan.nextDouble();
                score[0][6]=scan.nextDouble();
                rating[0]=scan.nextDouble();
                score[1][0]=scan.nextDouble();
                score[1][1]=scan.nextDouble();
                score[1][2]=scan.nextDouble();
                score[1][3]=scan.nextDouble();
                score[1][4]=scan.nextDouble();
                score[1][5]=scan.nextDouble();
                score[1][6]=scan.nextDouble();
                rating[1]=scan.nextDouble();
                score[2][0]=scan.nextDouble();
                score[2][1]=scan.nextDouble();
                score[2][2]=scan.nextDouble();
                score[2][3]=scan.nextDouble();
                score[2][4]=scan.nextDouble();
                score[2][5]=scan.nextDouble();
                score[2][6]=scan.nextDouble();
                rating[2]=scan.nextDouble();
                player[i]=new Diving(name,country,score,rating);
               
                System.out.print("Diver: "+name+"("+country+")"+"\n");
                System.out.print("Judges score: ");
                for(int j=0;j<7;j++){
                    System.out.print(score[0][j]+" ");
                }
                System.out.println("");
                System.out.println("Difficulty Rating: "+ rating[0]);
               
             System.out.print("Judges score: ");
                for(int j=0;j<7;j++){
                    System.out.print(score[1][j]+" ");
                }
                System.out.println("");
                System.out.println("Difficulty Rating : "+ rating[1]);
                 System.out.print("Judges score: ");
                for(int j=0;j<7;j++){
                    System.out.print(score[2][j]+" ");
                }
                System.out.println("");
                System.out.println("Difficulty Rating: "+ rating[2]);
                all[i]=player[i].finalScore(score, rating);
                System.out.println("Final score: "+all[i]);
                i++;
                if(i<=4){
                scan.nextLine();
                }
            } 
            Arrays.sort(all);
            for(int f=0;f<5;f++){
                if(all[4]==player[f].getScore()){
                    System.out.println("Gold: "+player[f].getName()+" ("+player[f].getCountry()+")");
                }  
            }
                 for(int l=0;l<5;l++){
                        if(all[3]==player[l].getScore()){
                    System.out.println("Silver: "+player[l].getName()+" ("+player[l].getCountry()+")");
                } 
                } for(int h=0;h<5;h++){
                       if(all[2]==player[h].getScore()){
                    System.out.println("Bronze: "+player[h].getName()+" ("+player[h].getCountry()+")");
                }
                } 
            
            scan.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            System.out.println("Error when input the file");
        }
    }
    
}
