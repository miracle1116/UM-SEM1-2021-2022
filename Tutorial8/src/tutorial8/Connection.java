package tutorial8;

public class Connection {
    private static int cnn=0;
    public Connection(){
        cnn++;
    }
    public void disconnect(){
        cnn--;
    }
    public String toString(){
        return "The number of connection is : "+cnn;
    }
}
