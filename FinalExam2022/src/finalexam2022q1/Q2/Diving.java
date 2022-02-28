/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalexam2022q1.Q2;

import java.util.Arrays;

/**
 *
 * @author yiqua
 */
public class Diving {
    private String name, country;
    private double[][]score1;
    double rating[];
    double sum=0;

    public Diving(String name, String country, double[][] score1, double[] rating) {
        this.name = name;
        this.country = country;
        this.score1 = score1;
        this.rating = rating;
    }



    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
    
     public double finalScore(double[][]a,double []rating){
         for(int i=0;i<3;i++){
                 Arrays.sort(a[i]);
                 sum+=((a[i][2]+a[i][3]+a[i][4])*rating[i]);           
         }return sum;
   
       
    }
    public double getScore(){
        return sum;
    }
    
    
}
