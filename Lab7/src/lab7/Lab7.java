 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLConnection;

/**
 *
 * @author yiqua
 */
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* //Question1 
        try{
        ObjectOutputStream course =new ObjectOutputStream(new FileOutputStream("coursename.dat"));
        course.writeUTF("WXES1116");
        course.writeUTF("Programming I");
        course.writeUTF("WXES1115");
        course.writeUTF("Data Structure ");
        course.writeUTF("WXES1110");
        course.writeUTF("Operating System");
        course.writeUTF("WXES1112");
        course.writeUTF("Computing Mathematics I");
        course.close();
        }catch(IOException e){
            System.out.println("Some problem occur");
        }
        System.out.print("Enter course to search; ");
        Scanner scan= new Scanner(System.in);
        String x = scan.nextLine();
        try{
            ObjectInputStream name = new ObjectInputStream(new FileInputStream("coursename.dat"));
            try{
                while(true){
                    
                    if(x.equals(name.readUTF())){
                        System.out.println(name.readUTF());
                    }
                }
            }catch(EOFException e){               
                
            }
        }catch(IOException e){
            System.out.println("File Not Found");
        }
    */
       
       //Question2 
       try {           
            PrintWriter web = new PrintWriter(new FileOutputStream("index.htm"));
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            while(in.hasNextLine()){
                web.println(in.nextLine());
                
            }
            web.println(in);
            web.close();
       }
        catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
       
       
       /*//Question 3
       try{
           PrintWriter reversefile= new PrintWriter(new FileOutputStream("reverse.txt"));           
       try{
           Scanner reverse = new Scanner(new FileInputStream("course.txt"));
           String reversed="";
           while(reverse.hasNextLine()){                
                String [] str= reverse.nextLine().split("");
                for(int i =str.length-1;i>=0;i--){
                    reversed=reversed+str[i];                                        
                }reversefile.println(reversed);
                reversed="";
           }
           reverse.close();
           reversefile.close();
       }catch(IOException e){
           System.out.println("File not found");           
       }
       }catch(IOException a){
           System.out.println("Something Wrong");
       }*/
       
       
      /* //Question4 
       int counter=0,counterword=0,counterline=0;
       try{
           Scanner ques4 = new Scanner(new FileInputStream("course.txt"));         
           while(ques4.hasNextLine()){                
                String [] str= ques4.nextLine().split("");               
                for(int i =str.length-1;i>=0;i--){
                    counter++;                                       
                }               
           }
            while(ques4.hasNextLine()){                                
                String [] str1= ques4.nextLine().split(" ");                
                counterword= counterword+str1.length;                                                   
           }
           ques4.close();           
       }catch(IOException e){
         System.out.println("File not found");           
       }
        try{
           Scanner ques4 = new Scanner(new FileInputStream("course.txt"));               
            while(ques4.hasNextLine()){                                
                String [] str1= ques4.nextLine().split(" ");                
                counterword= counterword+str1.length;
                counterline++;
           }
           ques4.close();           
       }catch(IOException e){
         System.out.println("File not found");           
       }        
        System.out.println("The number of character = "+ counter);
        System.out.println("The number of word = "+counterword);
        System.out.println("The number of line = "+counterline);
      
      //Question5
      try{
          ObjectInputStream person=new ObjectInputStream(new FileInputStream("person.dat"));
          try{ 
              System.out.println(person.readInt());           
              while(true){
                 System.out.println(person.readUTF());
                 System.out.println(person.readInt());
                 System.out.println(person.readChar());
                
              }  
          
              }catch(EOFException e){
                      }           
      }catch(IOException e){
          System.out.println("File Not Found");
      }*/
        
      
      
     //QWuestion6
      try{
          String[] str2 =null;
          String[] str =null;
          Scanner input= new Scanner(new FileInputStream("product.txt"));
          Scanner input2=new Scanner(new FileInputStream("order.txt"));
          String save="",save2="";
          
          while(input.hasNextLine()){
             save=save+input.nextLine()+",";
          }str =save.split(",");
          while(input2.hasNextLine()){
              save2= save2+input2.nextLine()+",";
                         
          }str2 =save2.split(",");
           int counter =0;
           System.out.printf("%-12s%-22s%-11s%-15s%-10s\n","Product ID","Product Name","Quantity","PricePerUnit","Total");
           
          for(int i=0;i<str2.length;i++){          
          for(int j=0;j<str.length;j++){
              
              if(str2[i].equals(str[j])){
                 
                 // System.out.print(str2[i]+"       ");
                 // System.out.print(str[j+1]+"      ");
                 // System.out.print(str2[i+1]+"     ");
                  //System.out.print(str[j+2]+"      ");
                  double result=Integer.parseInt(str2[i+1])*Double.parseDouble(str[j+2]);
                 System.out.printf("%-12s%-22s%-11s%-17s%-8.2f\n",str2[i],str[j+1],str2[i+1],str[j+2],result);
                  //System.out.printf("%.2f",Integer.parseInt(str2[i+1])*Double.parseDouble(str[j+2]));
                  //.out.println();
                  counter++;
              }if(counter==5){
                  break;
              }
             
          }
        }input.close();
        input2.close();
      }catch(IOException e){
          System.out.println("File Not Found");
      }
    }
        }

