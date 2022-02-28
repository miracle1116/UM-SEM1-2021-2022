/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sample;

/**
 *
 * @author yiqua
 */
public abstract class ESS {
    protected String name, type;
    
    public String toString(){
        return "Name"+ name +"  \n Salary is  "+getSalary();
    }
    
    public abstract double getSalary();
    
}
