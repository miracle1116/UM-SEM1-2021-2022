/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutor10;

import java.util.Random;

/**
 *
 * @author yiqua
 */
public class Square implements Number, Comparable{
    private int num;
    public int getRandom(){
        Random r= new Random();
        num=r.nextInt();
        return num;
    }
    public int getNum(){
        return num;
    }
    public int compareTo(Object a){
        if(num>((Square)a).getNum()){
            return 1;
        }else if (num<((Square)a).getNum()){
            return -1;
        }
    }
}
