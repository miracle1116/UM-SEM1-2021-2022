package tutorial8;

public class Payment {
    private double amount;
    private String cheque;
    private String cardHolder;
    private String cardTypes;
    private String expirationDate;
    private String validationCode;
    private int paymentType;
    public Payment(double amount){
        this.amount=amount;  
        paymentType=1;
    }

    public Payment(double amount, String cheque) {
        this.amount = amount;
        this.cheque = cheque;
        paymentType=2;
        
    }

    public Payment(double  amount, String cardHolder, String cardTypes, String expirationDate, String validationCode) {
        this.amount = amount;
        this.cardHolder = cardHolder;
        this.cardTypes = cardTypes;
        this.expirationDate = expirationDate;
        this.validationCode = validationCode;
        paymentType=3;
    }

    @Override
    public String toString() {
        if(paymentType==1)
        return "The amount that pay by cash is "+amount+"\n";      
        else if(paymentType==2){
        return "Yhe amount that pay by check is "+amount+"\n"+
                "The checkque number is "+cheque;
    }
        else if(paymentType==3){
            return "The amount paid by credit card is "+amount+"\n"+
                    "The card Holder is "+cardHolder+"\n"+
                    "The card type is "+cardTypes +"\n"+
                    "The expiration date is "+ expirationDate+"\n"+
                    "The validation code is "+validationCode+"\n"; 
        }
        else return "";
    }
         
    
 
}
