/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finallexam;

/**
 *
 * @author yiqua
 */ 
import java.util.Arrays;
public class Player {


    private double [] score;
    private String name;
    private double diff;
    private double sum;

    public Player(double[] score, String name,double diff) {
        this.score = score;
        this.name = name;
        this.diff=diff;
    }

    public double calScore(double[]a,double diff){
        Arrays.sort(a);
        sum=(a[1]+a[2]+a[3])*diff;
        return sum;
    }

    @Override
    public String toString() {
        return name+ "score : ";
    }

    public double getSum() {
        return sum;
    }
}


