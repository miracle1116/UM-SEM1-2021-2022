/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial9;

/**
 *
 * @author yiqua
 */
public class PurchaseSystem {
    private String productCode;
    protected double UnitPrice; protected double TotalPrice;
    protected int quantity;

    public PurchaseSystem(String productCode, double UnitPrice, double TotalPrice, int quantity) {
        this.productCode = productCode;
        this.UnitPrice = UnitPrice;
        this.TotalPrice = TotalPrice;
        this.quantity = quantity;
    }
    
    public double Total(){
        return TotalPrice=UnitPrice*(double)quantity;
    }
    
    public void display(){
        System.out.println("Total price: "+ Total());
    }
    
}
