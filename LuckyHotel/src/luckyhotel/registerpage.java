/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luckyhotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author yiqua
 */
public class registerpage {
    public static void register(String userID, String email ,String password){
     Connection conn =null;
        Statement stmt=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/user","root","11162002abc");
            stmt =conn.createStatement();
            
            String sql=" INSERT INTO register_table "+
                    " VALUES  "+"("+ "'"+userID+ "'" + ", " + "'"+email+ "'"+ ", " + "'"+userID+ "'"+")" ;
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
    public static void registertext(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter your user ID: ");
        String userID=scan.nextLine();
       
        System.out.print("Please enter your email address: ");
        String email=scan.nextLine();
        
        System.out.print("Please enter password: ");
        String password=scan.nextLine();
        //can add enter second password
        registerpage.register(userID, email, password);
        
        
        
    }
    
    
}
