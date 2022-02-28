/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l1q2;

/**
 *
 * @author yiqua
 */
public class Son extends Father {
    private String name;
    
    public Son(String fname, String addr,String car,String name){
        super(fname,addr,car);
        this.name=name;
        
    }

    @Override
    public String toString() {
        return "My name is "+name+"\n"+ super.toString();
    }
    
    
}
