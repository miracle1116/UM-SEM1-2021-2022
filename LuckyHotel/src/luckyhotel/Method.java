/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luckyhotel;
import static com.mysql.jdbc.Messages.getString;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import static javax.swing.UIManager.getInt;

/**
 *
 * @author yiqua
 */
//WHERE email="+"'"+email+"'"
public class Method {
    //login method
    public static boolean checkidUser(String email, String password){
        boolean check=false;
           try
    {
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/user";//"user" can change
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "11162002abc");//password can change
      String query = "SELECT* FROM register_table WHERE email = "+"'"+ email +"'";//re3gister table is the name of table in dataset
      Statement st = conn.createStatement();

      ResultSet rs = st.executeQuery(query);
      

        while(rs.next()){
         String pass = rs.getString("Password");        
             if(pass.equals(password)){
                 check=true;               
             }
         }             
 
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
      return check=false;
    }
         return check;
     }
    
    
    public static boolean checkidAdmin(String adminID, String password){
        boolean check=false;
           try
    {
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/admin";//"user" can change
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "11162002abc");//password can change
      String query = "SELECT* FROM admin_table WHERE adminID = "+"'"+ adminID +"'";//re3gister table is the name of table in dataset
      Statement st = conn.createStatement();

      ResultSet rs = st.executeQuery(query);
      

        while(rs.next()){
         String pass = rs.getString("Password");        
             if(pass.equals(password)){
                 check=true;               
             }
         }             
 
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
         return check;
     }
    public static void addNewRoom(String roomID,int guest,int Singlebed, int Doublebed, double price){
        Connection conn =null;
        Statement stmt=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/room","root","11162002abc");
            stmt =conn.createStatement();
            
            String sql=" INSERT INTO room1 "+
                    " VALUES  "+"("+ "'"+roomID+ "'" + ", "  + guest+ ", " + Singlebed+", "+ Doublebed+", " + price+")" ;
            stmt.executeUpdate(sql);
        }catch(SQLException  se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
                
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }
    
    public static void displayRoom(){
         try
    {
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/room";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "11162002abc");

      String query = "SELECT * FROM room1";

      Statement st = conn.createStatement();

      ResultSet rs = st.executeQuery(query);

      while (rs.next())
      {       
        String roomID = rs.getString("roomID");
        String Price = rs.getString("price");
        System.out.format("Room ID:"+ "%s\n", roomID);
        System.out.format("Price:"+ "%s\n", Price);
      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    }
    
    
     public static void register(String email,String password){
        Connection conn =null;
        Statement stmt=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/user","root","password");
            stmt =conn.createStatement();
            
            String sql=" INSERT INTO room1 "+
                    " VALUES  "+"("+ "'"+email+ "'" + ", "  + password+")" ;
            
            stmt.executeUpdate(sql);
        }catch(SQLException  se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
                
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }
    
      public static void addNewRoom(String roomType, String roomNo){
        Connection conn =null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/room","root","11162002abc");
            String query = "SELECT * FROM room2 WHERE Type= "+"'"+roomType+"'" ;

            Statement st = conn.createStatement();

            st.executeQuery(query);

                String Type = getString("Type");
                String descrip= getString("Description");
                Integer guest = getInt("Guest");
                Integer Bed = getInt("Bed");
                double pricePerN= getDouble("Price/Night");
      

            String sql=" INSERT INTO room2 "+
                    " VALUES  "+"("+ "'"+Type+ "'" + ", " +"'"+roomNo+"'"+","+"'" + descrip+"'"+ ", " + guest+", "+ Bed +", " + pricePerN+","+"'Available')" ;    
            st.executeUpdate(sql);
      
        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static double getDouble(String priceNight) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
