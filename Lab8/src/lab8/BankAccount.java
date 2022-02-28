/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author yiqua
 */
public class BankAccount {
    private String name;
    private String IcOrPass;
    private int deposit;
    private int money;

    public BankAccount(String name, String IcOrPass, int money) {
        this.name = name;
        this.IcOrPass = IcOrPass;
        this.money = money;
    }

    public void deposit(int deposit) {
        money= money+deposit;

    }
    
    public void withdraws(int withdraws) {
        money= money-withdraws;
    }
    
    public void display(){
        System.out.println(money);
    }
    
    
        
    
}


