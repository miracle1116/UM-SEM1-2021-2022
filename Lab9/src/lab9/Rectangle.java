/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

import java.text.DecimalFormat;

/**
 *
 * @author yiqua
 */
public class Rectangle extends Shape{
    private double sideLength1,sideLength2;
   DecimalFormat df = new DecimalFormat("###.##");
    public Rectangle(double sideLength1, double sideLength2, String name, double perimeter, double area) {
        super(name, perimeter, area);
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
    }


     public double perimeter(){
         return perimeter=sideLength1*sideLength2 ;         
     }
     public double area(){
         return area=sideLength1*sideLength2;
     }
     
    
 @Override
   public String display(){
       return super.display()+"\n"+"Perimeter: "+ df.format(perimeter())+"\n"+"Area: "+df.format(area());
   }

    
    
    public void perimeterNarea(){
        System.out.println("Perimeter: "+ (sideLength1*2 + sideLength2*2));
        System.out.printf("Area: "+"%.2f",sideLength1*sideLength2);
    }
}

