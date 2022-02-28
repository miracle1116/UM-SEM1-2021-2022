/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.reflect.Array.get;
import java.util.Scanner;

/**
 *
 * @author yiqua
 */

public class Lab9 { 

    public static double compute(int s, double ch){
       if(s>=150){
                return  ch= ch*3;
            }else if(s>=100&&s<150){
                 return ch= ch*2;
            }else if(s>=50&&s<100){
                return ch= ch*1.5;
            }else 
                return ch= ch*1;
    }
    
   public static void main(String[] args) {
       //Question1
       Circle x= new Circle("Ball",0,0,23);
        System.out.println(x.display());
    /*
    String []profil;
        
    
    Student Ali= new Student("","","",0,0,"Ali",'M',"2002-11-16");
   try {
        Scanner ques2 = new Scanner(new FileInputStream("course.txt"));
        while(ques2.hasNextLine()){   
            
    }
         }catch(FileNotFoundException e){
            System.out.println("File Not found");
     }
    
    
     //Qyestion 2
    Student Yq =new Student(null,null,null,null,null,"Ewe Yi Quan",'M',"2001-11-16");
    String []cC= new String[5];
    String [] CName= new String[5];
    String [] Year= new String[5];
    int [] sem= new int[5];
    int [] mark= new int [5];
    
    
    try{
        Scanner ques2=new Scanner(new FileInputStream("course.txt"));
        while(ques2.hasNextLine()){
            for(int i =0;i<5;i++){
                cC[i]=ques2.nextLine();
                CName[i]=ques2.nextLine();
                Year[i]=ques2.nextLine();
                sem[i]=Integer.parseInt(ques2.nextLine());
                mark[i]=Integer.parseInt(ques2.nextLine());
               
            }
        }
                                                                                                                             
        ques2.close();
    }catch(IOException e){
        System.out.println("File Not Found");
    }
    
    
    Yq.setCourseCode(cC);
    Yq.setCourseName(CName);
    Yq.setSession(Year);
    Yq.setSemester(sem);
    Yq.setMark(mark);
    
       System.out.println("Name: "  +Yq.getName());
       System.out.println("Date of Birth; "+Yq.getDOB());
       System.out.println("Gender: "+Yq.getGender());
       for(int i=0;i<5;i++){
           System.out.println("Course code: "+Yq.getCourseCode()[i]);
           System.out.println("Course Name: "+Yq.getCourseName()[i]);
           System.out.println("Semester: : "+Yq.getSemester()[i]);
           System.out.println("Year: "+Yq.getSession()[i]);
           System.out.println("Mark: "+ Yq.getMark()[i]);
           System.out.println("Gred: "+ Yq.getGrade(Yq.getMark()[i])+"\n");
       }
    //Question3
    
    Lecturer Ang =new Lecturer(null,null,null,null,null,null,"Ang Tan Fong",'M',"1960-07-25");
    String []courseCode= new String[4];
    String []Cn= new String[4];
    String []session= new String[4];
    String []semester= new String[4];
    double [] cH= new double[4];
    double ccH=0;
    int [] student= new int[4];
    try{
        Scanner ques3=new Scanner(new FileInputStream("ABC.txt"));
        while(ques3.hasNextLine()){
            for(int i =0;i<4;i++){
                courseCode[i]=ques3.nextLine();
                Cn[i]=ques3.nextLine();
                session[i]=ques3.nextLine();
                semester[i]=ques3.nextLine();
                student[i]=Integer.parseInt(ques3.nextLine());
                ccH=compute(student[i],Double.parseDouble(ques3.nextLine()));
                cH[i]=ccH;
            }
        }
                                                                                                                             
        ques3.close();
    }catch(IOException e){
        System.out.println("File Not Found");
    }
    
    Ang.setNumberOfRegistered(student);    
    Ang.setCourseCode(courseCode);
    Ang.setCourseName(Cn);
    Ang.setSession(session);
    Ang.setSemester(semester);
    Ang.setCreditHour(cH);
    
       System.out.println("Name: "  +Ang.getName());
       System.out.println("Date of Birth; "+Ang.getDOB());
       System.out.println("Gender: "+ Ang.getGender());
       for(int i=0;i<4;i++){
           System.out.println("Course code: "+courseCode[i]);
           System.out.println("Course Name: "+Cn[i]);
           System.out.println("Credit hour: "+cH[i]+"\n");
       }
         */
       
            
    //Question4
    Player Ali =new Player(0);
    Player John = new Player(0);
    
   while(Ali.getScore()<100&&John.getScore()<100){
       Ali.PlayGame1();
       System.out.println(Ali.getScore());
       John.PlayGame1();
       System.out.println(John.getScore());
   }
    if(Ali.getScore()>=100){
       System.out.println("Ali Win"+ " with Score: "+ Ali.getScore());
   }else{
       System.out.println("John Win"+" with Score: "+ John.getScore());
   }

  /* if(Ali.getScore()==100){
       System.out.println("Ali Win"+ " with Score: "+ Ali.getScore()+" John Score: "+John.getScore());
   }else if(John.getScore()==100){
       System.out.println("John Win"+" with Score: "+ John.getScore()+" Ali Score: "+ Ali.getScore());
   }*/
    
    
     }
   
}

