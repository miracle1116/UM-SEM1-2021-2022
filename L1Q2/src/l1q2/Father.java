/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l1q2;
public class Father {
    private String name, houseadress,car;

    public Father(String name, String houseadress, String car) {
        this.name = name;
        this.houseadress = houseadress;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Father: "  + name + "\nhouseadress: " + houseadress + "\ncar: " + car ;
    }
}

