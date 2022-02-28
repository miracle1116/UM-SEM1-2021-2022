/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial9;

/**
 *
 * @author yiqua
 */
public class Animal extends Organism{
    private int eating;

    public Animal(int eating, double iSize, double gRate) {
        super(iSize, gRate);
        this.eating = eating;
    }

    @Override
    public String toString() {
        return "Animal" + "eating: " + eating+"\n"+ "Initial Size : "+iSize+"\n"+"Growth Rate: " +gRate;
    }
    
}
