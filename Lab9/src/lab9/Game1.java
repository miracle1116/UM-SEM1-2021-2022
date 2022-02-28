/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

import java.util.Random;

/**
 *
 * @author yiqua
 */
public class  Game1 extends Player{
    Random rand =new Random();
    
    public void PlayGame1(){
        int dice= rand.nextInt(6)+1;
        int dice2=rand.nextInt(6)+1;
        
        Score=Score+dice+dice2;
        while(dice==dice2){
            dice=rand.nextInt(6)+1;
            dice2=rand.nextInt(6)+1;
            Score=dice+dice2;           
        }
    }
    
    
}
