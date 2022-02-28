/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author yiqua
 */
public class permanentStaff extends Staff {
    private String category;
    

    public permanentStaff( String Name, String category) {
        super(Name);
        this.category = category;
    }
    
    public double getSalary(){
        if(category.equals("A")){
            return salary=4000;
        }else if(category.equals("B")){
            return salary= 3000;
        }else return salary=2000;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Name: "+super.Name +"\n" +
                "Category: "+ category+"\n"+
                "Salary: "+ getSalary()+"\n";
    }
            
    
    
    
}
