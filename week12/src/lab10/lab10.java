
package lab10;

public class lab10 {
    public static void main(String[] args) {
       ContractStaff a= new ContractStaff("YQ",1500);
        System.out.println(a.toString());
        
        /*Appointment c = new Appointment(13,1,2022,14,15);
        c.saveAppointment(c);     
         Appointment e = new Appointment(13,1,2022,15,17);        
        e.saveAppointment(e);
          Appointment d = new Appointment(15,1,2022,14,15);
        d.saveAppointment(d);*/
          Appointment f = new Appointment(15,1,2022,14,15);
       
        
        System.out.println(f.search(f.getDay(),f.getStartTime(),f.getEndTime()));
        
    }
     
    
}
