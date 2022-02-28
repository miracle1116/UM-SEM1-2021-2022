package tutorial8;
//a
public class Student {
    
    //b
    private String cn;

    //c
    public Student() {
        cn=null;
    }

    //d
    public Student(String cn) {
        this.cn = cn;
    } 
    
    //e
    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getCn() {
        return cn;
    }

    //f
    public void displayCn(){
        System.out.println(getCn());
    }
   
    
        
    }
    

