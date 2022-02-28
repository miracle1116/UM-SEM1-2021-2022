/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

/**
 *
 * @author yiqua
 */
public class Shape {
    private String name;
    protected double perimeter,area;

    public Shape(String name, double perimeter, double area) {
        this.name = name;
        this.perimeter = perimeter;
        this.area = area;
    }



    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public String display() {
        return "Name: " + name ;
    }     
        
    
}//"%s%.2f\n%s%.2f",
