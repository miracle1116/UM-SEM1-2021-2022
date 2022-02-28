package lab8;

public class Money {
    private double amount;
    private int note;
    private int coins;
    int cn100=0,cn50=0,cn10=0,cn5=0,cn1=0,cn05=0,cn02=0,cn01=0,cn005=0;
    
    public Money(double amount){
        this.amount=amount;
    }
    
    public double round(){
       
        int realnum=(int)(amount*10);
        int lastnum =(int)((amount*100)%10);
        if(lastnum==0||lastnum==1||lastnum==2){
            lastnum=0;
        }else if(lastnum==3||lastnum==4||lastnum==5||lastnum==6||lastnum==7){
            lastnum=5;
        }else if(lastnum==8||lastnum==9){
            lastnum=10;
        }
        double trueAmount=(((int)realnum*10)+(double)lastnum)/100;
        return trueAmount ;
        }
    
    public double add(double a, double b){
        return a+b;
    }
     public double substract(double a, double b){
        return a-b;
    }

    public double getAmount() {
        return amount;
    }
    
    public void getMoney(double a){
        
        while(a>=100){
            a =a-100;
            cn100++ ;
        }
        while(a>=50){
            a =a-50;
            cn50++ ;
        }
        while(a>=10){
            a =a-10;
            cn10++ ;
        }
        while(a>=5){
            a =a-5;
            cn5++ ;
        }
        while(a>=1){
            a =a-1;
            cn1++ ;
        }
        while(a>=0.5){
            a =a-0.5;
            cn05++ ;
        }
        while(a>=0.2){
            a =a-0.2;
            cn02++ ;
        }
        while(a>=0.1){
            a =a-0.1;
            cn01++ ;
        }
        while(a>=0.05){
            a =a-0.05;
            cn005++ ;
        }
        System.out.println("The number of RM100 used: "+ cn100);
        System.out.println("The number of RM50 used: "+ cn50);
        System.out.println("The number of RM10 used: "+ cn10);
        System.out.println("The number of RM5 used: "+ cn5);
        System.out.println("The number of RM1 used: "+ cn1);
        System.out.println("The number of 50sen used: "+ cn05);
        System.out.println("The number of 20sen used: "+ cn02);
        System.out.println("The number of 10sen used: "+ cn01);
        System.out.println("The number of 5sen used: "+ cn005);
        
        
        
    }
    }
        

