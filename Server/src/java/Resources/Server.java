/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import java.awt.HeadlessException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author w1544390
 */
@WebService(serviceName = "Server")
public class Server {
ResultSet rs = null;
PreparedStatement pst=null;
 Connection connection;
  PreparedStatement preparedStmt;
    /**
     * Single Thread Web Service
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName="Login")
    public boolean Login(@WebParam(name = "name")String name,@WebParam(name= "password") String password){
      boolean x = false;  
         try{
         Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException e){
         System.out.println("ERROR: MySQL JDBC Driver not found; is your CLASSPATH set?");
         e.printStackTrace();
         System.exit(0);
       }
      try    // open the connection to the MySQL server
       {
          // this is for running on the University network, elephant:3306
connection = DriverManager.getConnection(
                  "jdbc:mysql://elephant.ecs.westminster.ac.uk:3306/w1544390_0",
                  "w1544390", "FjVBATXqm7tC");
 
       } catch (SQLException e)  // check for connection error
       {
          System.out.println("ERROR: MySQL Connection Failed!");
          e.printStackTrace();
         System.exit(0);
       }
       System.out.println("Database connected!");  
        String sql ="select * from Clients where Username=? and Password=?";
 
try{
pst =connection.prepareStatement(sql);
 
pst.setString(1,name);
 
pst.setString(2,password);
 
rs=pst.executeQuery();
 
if(rs.next()){
 
x = true;
 
}else{
 
x = false;
 }
 
}
 
catch(SQLException | HeadlessException ex){
ex.printStackTrace();
System.exit(0);
}
       return x;
    }
    
    @WebMethod(operationName="Register")
    public boolean Register(@WebParam(name = "username")String username, @WebParam(name = "password")String password){
        boolean y = false;
                 try{
         Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException e){
         System.out.println("ERROR: MySQL JDBC Driver not found; is your CLASSPATH set?");
         e.printStackTrace();
         System.exit(0);
       }
      try    // open the connection to the MySQL server
       {
          // this is for running on the University network, elephant:3306
connection = DriverManager.getConnection(
                  "jdbc:mysql://elephant.ecs.westminster.ac.uk:3306/w1544390_0",
                  "w1544390", "FjVBATXqm7tC");
 
       } catch (SQLException e)  // check for connection error
       {
          System.out.println("ERROR: MySQL Connection Failed!");
          e.printStackTrace();
         System.exit(0);
       }
       System.out.println("Database connected!");  
       String newUser = "insert into Clients(Username, Password) values (?,?)";
    try {
        preparedStmt = connection.prepareStatement(newUser);
        preparedStmt.setString(1, username);
        preparedStmt.setString(2, password);
        preparedStmt.execute();
        preparedStmt.close();
y = true;
    } catch (SQLException ex) {
       ex.printStackTrace();
        y = false;
    } 
        return y;
    }
    
     @WebMethod(operationName = "NewMessage")
     public boolean newMessage(@WebParam(name = "name")String name,@WebParam(name = "timestamp")String timestamp,@WebParam(name = "message") String message){
         boolean c = false;
          try{
         Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException e){
         System.out.println("ERROR: MySQL JDBC Driver not found; is your CLASSPATH set?");
         e.printStackTrace();
         System.exit(0);
       }
      try{
          // this is for running on the University network, elephant:3306
connection = DriverManager.getConnection(
                  "jdbc:mysql://elephant.ecs.westminster.ac.uk:3306/w1544390_0",
                  "w1544390", "FjVBATXqm7tC");
 
       } catch (SQLException e)  // check for connection error
       {
          System.out.println("ERROR: MySQL Connection Failed!");
          e.printStackTrace();
         System.exit(0);
       }
       System.out.println("Database connected!");  
       String newMessage = "insert into SingleThread(Name,Date,Message) values (?,?,?)";
    try {
        preparedStmt = connection.prepareStatement(newMessage);
        preparedStmt.setString(1, name);
        preparedStmt.setString(2, timestamp);
         preparedStmt.setString(2, message);
         preparedStmt.execute();
     if (preparedStmt != null) {
				preparedStmt.close();
                                c = true;
			}else{
         c = false;
     }

if (connection != null) {
				connection.close();
			}
    } catch (SQLException ex) {
       ex.printStackTrace();
       System.exit(0);
    } 
         
         
         
         return c;
     }
    
 public String History(String history){
         try            // initialise the JDBC driver, with a check for it working
       {
         Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException e)
       {
         System.out.println("ERROR: MySQL JDBC Driver not found; is your CLASSPATH set?");
         e.printStackTrace();
       }
 
       System.out.println("MySQL JDBC Driver Registered.");
 connection = null;
 
       try{
          connection = DriverManager.getConnection(
                 "jdbc:mysql://elephant.ecs.westminster.ac.uk:3306/w1544390_0",
                 "w1544390", "FjVBATXqm7tC"); 
       } catch (SQLException e){
          System.out.println("ERROR: MySQL Connection Failed!");
          e.printStackTrace();
       }
     PreparedStatement ps;
       String selectSQL = "select * from SingleThread";
      try{
           ps = connection.prepareCall(selectSQL);
           ResultSet messages = ps.executeQuery();
           while(rs.next()){
               history += messages.getString("Name") + " "+ messages.getString("Date")+ " " + messages.getString("Message") +"\n";
           }
           
      }catch(Exception e){
          e.printStackTrace();
          System.exit(0);
      }
     return history;
 }   
    
    
}
