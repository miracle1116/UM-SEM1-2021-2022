
package tutorial8;

public class Animal {
    private String type; private String colour;private int numofLeg;

    public Animal() {

    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public int getNumofLeg() {
        return numofLeg;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setNumofLeg(int numofLeg) {
        this.numofLeg = numofLeg;
    }

    public String toString() {
        return "Animal{" + "type = " + type + ", colour = " + colour + ", numofLeg = "  + numofLeg + '}';
    }

    public Animal(String type, String colour, int numofLeg) {
        this.type = type;
        this.colour = colour;
        this.numofLeg = numofLeg;
    }
    
    
        
    
}
