/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l1q2;

/**
 *
 * @author yiqua
 */
public class PermanentStaff extends Staff{
    private String grade;

    public PermanentStaff(String grade, String name, String ic) {
        super(name, ic);
        this.grade = grade;
    }
    
    public double getSalary(){
        if(grade.equals("A01")){
            return 2000;
        }else if(grade.equals("A02")){
            return 2500;
        }else
            return 0;
    }

    @Override
    public String toString() {
        return "PermanentStaff:\n" +super.toString()+ "grade:" + grade +"\n"+"Salary: "+ getSalary()+"\n";
    }
    
    
}
