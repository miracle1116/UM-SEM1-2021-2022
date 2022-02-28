package lab8;

public class Lab8 {

    
    public static void main(String[] args) {
        /*//Question1
        Number a = new Number();
        Number b = new Number(5); // generate 5 random integers within 0 to 100.
        Number c = new Number(4, 50); // generate 4 random integers within 0 to 50.

        
        
        
        //Question 2
        BankAccount haha=new BankAccount("yiquan","021116",100);
        haha.deposit(200);
        haha.withdraws(50);
        haha.display();
        
        
        
        //Question3
        WeightCalculator Amin= new WeightCalculator();
        Amin.setAge(19);
        Amin.setHeight(178);
        Amin.recommenWeight();
        
        
        //Question4
        Fraction frac= new Fraction();
        frac.setDenominator(10);
        frac.setNumerator(5);
        System.out.println(frac.toString());
        
        
        //Question 5
        Game dice1=new Game("John");
        Game dice2= new Game("Johan");
        boolean haha=true;
        int P1=0;
        int P2=0;
        
        while(haha==true){
            P1 = P1 + dice1.move();
            P2=  P2 + dice2.move();
            if(P1>100){
                System.out.println("John wins");
                haha=false;
            }
            if(P2>100){
                System.out.println("Johan wins");
                haha=false;
            }                              
    }*/
            
        //Question 6
        BurgerStall Ramly=new BurgerStall("Ramly",0);
        BurgerStall KFC = new BurgerStall("KFC",0);
            Ramly.sold(50);
            Ramly.sold(100);
            KFC.sold(200);
            KFC.sold(100);  
            System.out.println("Total of Ramly Burger sold: "+ Ramly.track());
            System.out.println("Total of KFC burger sold: "+ KFC.track());
            System.out.println("Total burger sold: "+ (Ramly.track()+KFC.track()));

        
        //Question 7
        Money mine = new Money(124.18);
        Money mine2 = new Money(10.16);
        System.out.println(mine.round());
        mine.getMoney(mine.round());
        
  
    }
    
}
