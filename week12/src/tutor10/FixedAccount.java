package tutor10;

public class FixedAccount implements Interest {
    private double balance;
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public double computeInterest(){
        return balance+(0.03/12);
    }

    @Override
    public String toString() {
        return "FixedAccount: "  + balance +"\n"+
                "Interes: " + computeInterest();
        
    }
    
}
