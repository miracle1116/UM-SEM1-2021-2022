/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.util.Random;

public class Game {
    private String name;
    private int P1;
    private int P2;
    Random rand= new Random();
    

    public Game(String name) {
        this.name = name;
    }
    
    public int move(){        
        return rand.nextInt(7);
    }
    
    
    
}
