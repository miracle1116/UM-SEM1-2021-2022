/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author yiqua
 */
public class temporaryStaff extends Staff{
    private int hour;

    public temporaryStaff(String Name, int hour ) {
        super(Name);
        this.hour = hour;
    }
    
    public double getSalary(){
        return salary=15*hour;
    }
        @Override
    public String toString() {
        return "Name: "+super.Name +"\n" +
                "Category: Temporary Staff"+"\n"+
                "Salary: "+ salary+"\n";
    }
}
