package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseClass {

    static String url = "jdbc:mysql://localhost:3306/bootcamp";
    static String userName = "root";
    static String password = "#####";

    public static void executeQuery(String[] query) throws Exception {

        //1. Get the connection - One Time Setup activity
        Class.forName("com.mysql.cj.jdbc.Driver");  // registered the driver
        Connection con = DriverManager.getConnection(url, userName, password);  // connected to the database

        Statement stmt = con.createStatement();
        // storing the results of query after the execution of the query
        // 2. we re going to use whenever we want to execute the query
        ResultSet rs = stmt.executeQuery("Select * from employees");

        //3. Process the result
        while (rs.next()) {
            System.out.println(rs.getString("first_name"));
        }
        //4. Close the statement - One Time Closing activity
        stmt.close();
        con.close();
    }
}
