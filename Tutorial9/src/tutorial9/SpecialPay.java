/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial9;

/**
 *
 * @author yiqua
 */
public class SpecialPay extends PaySystem{

    public SpecialPay(double hour, double payrate) {
        super(hour, payrate);
        
        
    }
    
    public double getPay(){
        return super.getPay()*1.3;
    }

}
