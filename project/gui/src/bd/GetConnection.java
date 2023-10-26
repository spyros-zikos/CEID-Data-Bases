package bd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class GetConnection {
    public Connection getConnection(){
        //String DB_URL = "jdbc:mysql://localhost:3306/travelagency";
      //String USERNAME = "root";
      //String PASSWORD = "root";        

      String DB_URL = "";
      String USERNAME = "";
      String PASSWORD = "";
      
      try {
      File myObj = new File(".\\db_settings.txt");
      Scanner sc = new Scanner(myObj);

      DB_URL = sc.nextLine();
      USERNAME = sc.nextLine();
      PASSWORD = sc.nextLine();
      sc.close();
      } catch (FileNotFoundException e) {
      System.out.println("An error occurred!!!!!");
      e.printStackTrace();
      }
        
              
        Connection connection;
        try{
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            return connection;
        }catch(SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
}
