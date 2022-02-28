package lab10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Appointment implements Searchable{
    private int day, month,year,startTime , endTime;

    public Appointment(int day, int month, int year, int startTime, int endTime) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }
    
    
     public void saveAppointment(Appointment a){
        try {
            PrintWriter write =new PrintWriter(new FileWriter("Appointment.txt",true));
            write.println(a.getDay()+" ");
            write.println(a.getMonth()+" ");
            write.println(a.getYear()+" ");
            write.println(a.getStartTime()+" ");
            write.println(a.getEndTime());          
            write.close();
        } catch (IOException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
     
    public boolean search(int date,int StartTime,int EndTime){
        boolean check=false;
        try{
            Scanner scan = new Scanner(new FileInputStream("Appointment.txt"));
            int [][] app=new int [4][5];
            int count =0;
            while(scan.hasNextLine()){  
                for(int i =0; i<4;i++){                   
                        app[i][0] =scan.nextInt();
                        app[i][1] =scan.nextInt();
                        app[i][2] =scan.nextInt();
                        app[i][3] =scan.nextInt();
                        app[i][4] =scan.nextInt();                                               
                }
                for(int i =0; i<4;i++){   
                    if(app[i][0]!=date&& app[i][3]!=StartTime&&app[i][4]!=EndTime )
                    {
                        count++;
                    }else {}
                       
                }                               
                if(count==4){
                    check = true;
                    
                }
                else 
                    check=false;
            }       
            scan.close();
        }catch(IOException e){
            System.out.println("File not found");
        }return check;        
    }
    
}
