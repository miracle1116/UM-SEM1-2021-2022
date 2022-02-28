/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutor10;

/**
 *
 * @author yiqua
 */
public class SavingAccount implements Interest {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    @Override
    public double computeInterest(){
        return balance*(0.005/12);
    }
    
    public String toString (){
        return "Fixed Accunt Balance: "+balance+"\n"+
                "This month interest: "+computeInterest()+"\n";
        
    }
}
