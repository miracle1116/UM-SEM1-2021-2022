/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial9;

/**
 *
 * @author yiqua
 */
public class PaySystem {
    private double hour, payrate;

    public PaySystem(double hour, double payrate) {
        this.hour = hour;
        this.payrate = payrate;
    }
    
    public double getPay(){
        return hour*payrate;
    }

    @Override
    public String toString() {
        return "Total payment "+getPay()+"\n";
    }
   
    

}
