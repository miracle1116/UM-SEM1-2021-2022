/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finallexam;

import java.awt.image.ImagingOpException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FinallExam {

    public static void main(String []args){
        int i=0; 
        try{
            Scanner scan= new Scanner(new FileInputStream("result.txt"));
            while(scan.hasNextLine()){
                i++;       System.out.println(i);
            }
            scan.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }


        String name;
        double diff;double []mark=new double[5]; Player []a= new Player[i];int j=0;
        try{
            Scanner scan= new Scanner(new FileInputStream("result.txt"));
            while(scan.hasNextLine()){
                name= scan.next();
                mark[0]= scan.nextDouble();
                mark[1]= scan.nextDouble();
                mark[2]= scan.nextDouble();
                mark[3]= scan.nextDouble();
                mark[4]= scan.nextDouble();
                diff=scan.nextDouble();
                a[j]= new Player(mark,name,diff);
                System.out.println(a.toString()+a[j].calScore(mark,diff)+"\n");
                j++;
            }
            double[] high=new double[i];
            for(int k=0;k<i;k++){
                high[k]=a[k].getSum();
            }
            Arrays.sort(high);
            for(int f=0;f<i;f++){
                if(a[f].getSum()==high[i-1]){
                    System.out.println(a[f].toString()+" win");
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
    

