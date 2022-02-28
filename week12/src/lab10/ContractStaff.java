package lab10;

public class ContractStaff extends Staff{
    private int sales;

    public ContractStaff(String Name,int sales) {
        super(Name);
        this.sales = sales;
    }
    
    
    public double getSalary(){
        return salary=500+0.5*sales;
    }
    
        @Override
    public String toString() {
        return "Name: "+super.Name +"\n" +
                "Category: ContractStaff"+"\n"+
                "Salary: "+ getSalary()+"\n";
    }
}

        
