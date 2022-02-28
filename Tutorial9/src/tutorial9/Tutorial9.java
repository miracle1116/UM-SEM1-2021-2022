package tutorial9;

public class Tutorial9 {
    /*Question1 a
    public static boolean compare(Student s, Teacher t){
        if(s.getClass()==t.getClass()){
        return true;
    }else 
            return false;
    }
*/
    
    /*Question1 b
    public static boolean isClass(Student s){
    if(s instanceOf Person){
         return true;}
    else
         return false;
    }
   
    */

     
    public static void main(String[] args) {
        /* Question 3
        SpecialPay Ali =new SpecialPay();
        System.out.println(Ali.Pay());
*/
        PurchaseSystem Ali= new PurchaseSystem("A001",10.0,10.0,10);
        Ali.display();
        

        
    }
    
}
