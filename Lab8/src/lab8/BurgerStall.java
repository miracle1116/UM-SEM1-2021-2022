
package lab8;

public class BurgerStall {
    private String ID;
    private int burger;
    int total;
        
    public BurgerStall(String ID, int burger) {
        this.ID = ID;
        this.burger = burger;
    }
    
    public int sold(int sold){
        total= total+sold;
       return  burger = burger+sold;        
    }
    
    public int track(){
        return burger;
    }
          
}
