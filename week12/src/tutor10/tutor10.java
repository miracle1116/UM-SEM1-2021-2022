
package tutor10;


public  class tutor10 {

    public static void main(String[] args) {
      /*  PermanentStaff lim=new PermanentStaff("lim ","A");
        ContractStaff haha= new ContractStaff("john",500);
        
        System.out.println(lim.toString());
        System.out.println(haha.toString());
    }
    
    private double discount;
    public double computeDiscount(int count, int itemCost){
          return discount; */
    
      SavingAccount a= new SavingAccount();   
      a.setBalance(60);
        System.out.println(a.toString());
    
    /*Person c= new Person("ghfiyf") {
          @Override
          public int compareTo(Object o) {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
      };
    Person b = new Person("ALI") {
          @Override
          public int compareTo(Object o) {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
      };
    Person e= new Person("iyg") {
          @Override
          public int compareTo(Object o) {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
      };
    Person []d= {c,b,e};
    for(int i=0;i<d.length-1;i++){

    for(int z=0;z<d.length-1;z++){
        if(d[i].getName().compareTo(d[i+1].getName())>0){
            String temp =d[i+1].getName();
            d[i+1]=d[i];
            d[i].setName(temp);          
        }
    }

        }for(int j=0;j<d.length;j++){
             System.out.println(d[j].getName());
          
    }
     */  
    
    final int max=5;
    Person[]p = new Person [max];
    Person temp;

    p[1]= new Person("i");
    p[2]= new Person ("egub");
    p[0]= new Person("iwhf");    p[3]= new Person("Chef wan ");
    p[4]= new Person("gopu");
    for(int i =0; i<p.length-1;i++){
        for(int j =0 ;j<p.length-1;j++){
            if(p[j].compareTo(p[j+1])>0){
                temp=p[j];
                p[j]=p[j+1];
                p[j+1]=temp;
            }
        }
    }
    for(int i =0; i<p.length;i++){
        System.out.println(p[i].toString());}
    
    }
    
}


