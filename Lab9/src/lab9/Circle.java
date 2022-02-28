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
public class Circle extends Shape {
    private double diameter;
    DecimalFormat df = new DecimalFormat("###.##");
    public Circle( String name, double perimeter, double area,double diameter) {
        super(name, perimeter, area);
        this.diameter = diameter;
    }

    public double perimeter(){
        return perimeter=(Math.PI*diameter);
    }
    
    public double area(){
        return area=(Math.PI*Math.pow(diameter/2, 2));
    }

    @Override
   public String display(){
       return super.display()+"\n"+"Perimeter: "+df.format(perimeter())+"\n"+"Area: "+df.format(area());
   }
    
    
    public void PeriNarea(){
        System.out.printf("Perimeter: "+"%.2f",(Math.PI*diameter)+"\n");
        System.out.printf("Area: "+"%.2f",(Math.PI*Math.pow(diameter/2, 2)));
    }
}
