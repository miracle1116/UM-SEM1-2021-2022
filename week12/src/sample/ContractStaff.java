/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sample;

import sample.ESS;

/**
 *
 * @author yiqua
 */
public class ContractStaff extends ESS{
      private String category;
      public double sales;

    public ContractStaff(String name,double s) {
        this.name=name;
        this.sales=s;
        this.type="Permanent Staff";
    }
    
    public double getSalary(){
        return 500+0.5*sales;

    }
}
