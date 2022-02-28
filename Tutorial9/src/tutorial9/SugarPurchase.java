/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial9;

/**
 *
 * @author yiqua
 */
public class SugarPurchase extends PurchaseSystem{
    private double sugarWeight;

    public SugarPurchase( String productCode, double UnitPrice, double TotalPrice, int quantity ,double sugarWeight) {
        super(productCode, UnitPrice, TotalPrice, quantity);
        this.sugarWeight = sugarWeight;
    }


    
     @Override
     public double Total(){
        return TotalPrice=UnitPrice*(double)quantity*sugarWeight;
    }
     
    @Override
    public void display(){
        System.out.println("Total price: " +Total());
    }
    
   
    
}
