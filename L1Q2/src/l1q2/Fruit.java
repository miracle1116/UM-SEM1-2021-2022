/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l1q2;

/**
 *
 * @author yiqua
 */
public class Fruit{
    private String name;
    protected String type;

    public Fruit(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Fruit{" + "name=" + name + ", type=" + type + '}';
    }
    
}
