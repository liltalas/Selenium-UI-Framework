package utilities;

import java.sql.*;

public class DataBaseUtils {
    // Utils - collection of methods

    // Goal: Connect Java and DataBase through JDBC driver (MySQL)
   static String url = ConfigReader.getConfigProperty("db.url");
   static String username = ConfigReader.getConfigProperty("db.username");
   static String password = ConfigReader.getConfigProperty("db.password");

   // we are declaring the variables outside of any methods you've made it an attribute of the class
   // so that any method in the class can access it
   static Connection con;
   static Statement stmt;
   static ResultSet rs;

   // try and catch usage over Exception: follow standard as in the ConfigReader;
    // catches the exception only one time, don't have to repeat

    public static void initializeDBProperties() {
        //1. Get the connection - One Time Setup activity
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // registered the driver
            con = DriverManager.getConnection(url, username, password); // connected to the database

            // Statement is an interface
            Statement stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet executeQuery(String query) {
        // 2. we re going to use whenever we want to execute the query
        try {
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static void closeConnection(){
        //3. Close the statement - One Time Closing activity
        try {
            stmt.close();
            con.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


}
