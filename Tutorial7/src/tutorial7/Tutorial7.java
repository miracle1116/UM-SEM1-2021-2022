package tutorial7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Tutorial7 {
 //Question 3
public static String stb(String a){
    String result="";
    char [] b= a.toCharArray();
    for (int i = 0; i < b.length; i++) {
        
 
        result += Integer.toBinaryString(b[i]);
        
    }
    
 return result  ;
     
}
    public static void main(String[] args) {
        /*Random rand =new Random();
        try{
        PrintWriter out= new PrintWriter(new FileOutputStream("integer.txt"));
        for(int i=0;i<10;i++){
            out.println(rand.nextInt(1001));
        }
        out.close();
        }catch (IOException e){
            System.out.println("File cannot be created");
        }
        
        
       try {
           int max=0;
            Scanner in = new Scanner(new FileInputStream("integer.txt"));
            while (in.hasNextInt()) {
               int num =in.nextInt();
               System.out.println(num);
               if(num>max){
                   max=num;
               }              
            }
            in.close();
           System.out.println("The maximun number is "+ max);            
        } catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
        }
        
        
      try{
        ObjectOutputStream binary = new ObjectOutputStream(new FileOutputStream("integer.dat"));
        for(int i =0;i<10;i++){
            binary.writeInt(rand.nextInt(1001));
        }binary.close();
        }catch( IOException e){
           System.out.println("Problem with file output");
        }
      
      
      try{
          ObjectInputStream in = new ObjectInputStream(new FileInputStream("integer.dat"));
          double sum =0;
              try{
                  
                  while(true){
                      int num = in.readInt();
                      System.out.print(num+" ");
                      sum=sum+num;
                  }
                  }catch(EOFException e){}
           System.out.println("\nAverage= "+ sum/1.0);                            
          }catch(IOException e){
              System.out.println("File Not Found");
            }
    */
try{
        PrintWriter write = new PrintWriter(new FileOutputStream("data.txt"));
        write.println(stb("Hello world"));
        write.close();
    }catch(IOException e){
        System.out.println("Something problem");
    }
 String str=""; 
try{
   
    Scanner in =new Scanner(new FileInputStream("data.txt"));        
    while(in.hasNext()){      
        int d= Integer.parseInt(in.next());
        str= str+ (char)d;
        System.out.printf("%08d",d);
        
    }
      
 }catch(FileNotFoundException e){  
     System.out.println("Not found");
} 
        System.out.println("");
System.out.println(str);
    }
 }
    
      
      
