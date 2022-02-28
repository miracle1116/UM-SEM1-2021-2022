/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l1q2;

/**
 *
 * @author yiqua
 */
public class Staff {
    private String name, ic;

    public Staff(String name, String ic) {
        this.name = name;
        this.ic = ic;
    }

    @Override
    public String toString() {
        return "Staff " + "name:" + name +"\n"+ "ic=" + ic + "\n";
    }
    
}
