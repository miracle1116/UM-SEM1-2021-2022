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
public class Player {
     int Score;

    public Player(int Score) {
        this.Score = Score;
    }

    public int getScore() {
        return Score;
    }
     Random rand =new Random();
     
     public void PlayGame1(){
        int dice= rand.nextInt(6)+1;
        int dice2=rand.nextInt(6)+1;
        
        Score=Score+dice+dice2;
        while(dice==dice2){
            dice=rand.nextInt(6)+1;
            dice2=rand.nextInt(6)+1;
            Score=Score+dice+dice2;           
}
     }
     public void PlayGame2(){
         while(Score!=100&&Score<101){
        int dice= rand.nextInt(6)+1;       
            Score=Score+dice;
        if(dice==6){
            dice=rand.nextInt(6)+1;
             
            if(dice==6){
                dice=0;
                 Score=Score+dice;
            }else
            Score=Score+dice;         
        } 
        if(Score>100){
           Score=Score-dice;           
     }
         }
     }
}
