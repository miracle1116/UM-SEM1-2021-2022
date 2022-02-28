/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author yiqua
 */
public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction(){
        numerator=0;
        denominator=0;           
}

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
     public static int findGCD(int a, int b){
        int gcd=0;
        for(int i=1; i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0){
                gcd=i;
            }
        }return gcd;             
    }

    @Override
    public String toString() {
        return "Lowest terms = "+ (numerator/findGCD(numerator,denominator))+ "/" +(denominator/findGCD(numerator,denominator)) ;
    }
     
    
}
