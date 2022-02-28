package lab8;

public class WeightCalculator {
    private int age;
    private int height;
    

    public WeightCalculator() {
        age=0;
        height=0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public void recommenWeight(){        
        System.out.printf("%.2f",(height-100+age/10)*0.9);
    }

    @Override
    public String toString() {
        return "WeightCalculator{" + "age=" + age + ", height=" + height + '}';
    }
    
}
