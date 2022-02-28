
package tutorial8;

public class Tutorial8 {

    public static void main(String[] args) {
     /*   //g
        Student Ali= new Student();
        
        //h
        Ali.setCn("012-345678");
        
        
        //i
        Animal lucky=new Animal();
        
        
        //j
        Animal Cat=new Animal("Meow","Black",4);
        
        
        //k
        Number num = new Number();
        System.out.println(num.toString());
        */
        //2
        Digit a = new Digit("4567");
        System.out.println(a.digitMultiplication());
        
        
        //3
        Coordinate myCoor= new Coordinate(1,4);
        System.out.println(myCoor.toString());
        
        
        //4
        Connection x =new Connection();
        Connection y =new Connection();
        Connection z =new Connection();
        System.out.println(z.toString());
        
        //5 
        Payment g=new Payment(24.6);
        System.out.println(g.toString());
        Payment f = new Payment(6492.34,"1523635173");
        System.out.println(f.toString());
        Payment i =new Payment(7193.754,"Ewe Yi Quan","Bank rakyat","22/06","11230");
        System.out.println(i.toString());
    }
    
}
