/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labreport;

import java.util.Scanner;

public class Labreport {
//function to calculate for validity of triangle
    public static int Validity(double x, double y, double z) {
        
//check condition for the triangle whether is it obeys triangle rule
        if (x + y <= z || x + z <= y || y + z <= x)
            return 0;
//return 0 for not obeying triangle rule
        else
            return 1;
//return 1 for obeying triangle rule
    }
  
     
    static void Triangle(double x, double y, double z){
        
        if (x == y && y == z )
          System.out.println("Equilateral Triangle");
    // if the three sides of triangle is equal, output the triangle is equilateral triangle
        else if (x == y || y == z || z == x )
          System.out.println("Isosceles Triangle");
    // if the two sides of triangle is equal, output the triangle is isosceles triangle
        else
          System.out.println("Scalene Triangle");
    //for the rest cases ,output  the triangle is scalene triangle
}


    public static void main(String[] args)
{        
        double x ,y ,z;
       //initialise three variables

        Scanner input= new Scanner(System.in);
//Create Scanner class
        System.out.print("Enter length of each side of triangle : ");
       //input for every sides of length of triangle in x, y and z
        x=input.nextDouble();
        y=input.nextDouble();
        z=input.nextDouble();
    
//Use if else statement to check the validity of triangle by number returning
        if((Validity(x,y,z))==1){
            //to ensure validity of triangle
            Triangle(x,y,z);
        }   
        else{
            System.out.println("Invalid triangle");
        //output invalid triangle if the value of three sides do not obey triangle rule
        }
    
  }
}


