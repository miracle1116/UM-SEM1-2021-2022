/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author yiqua
 */
public abstract class Staff {
    protected String Name;
    protected double salary;

    public Staff(String Name) {
        this.Name = Name;
    }
    public double getSalary(){
    return salary;}
    
}
