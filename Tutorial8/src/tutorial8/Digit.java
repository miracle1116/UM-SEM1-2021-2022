package tutorial8;

public class Digit {
    private String num;

    public Digit(String num) {
        this.num = num;
    }
    
    public int digitMultiplication(){       
        int multi=1;
        String[] number = num.split("");
        for(int i=0;i<number.length;i++){        
            multi=multi*Integer.parseInt(number[i]);
        }
        return multi;
    }

    
   
    
}
