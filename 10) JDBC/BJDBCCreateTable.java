// JDBC Program to Create a Table in MySQL Database

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BJDBCCreateTable {

    public static void main(String[] args) {

        // Database URL
        String url = "jdbc:mysql://localhost:3306/studentdb";

        // Database Credentials
        String username = "root";
        String password = "Saiyam";

        try {

            // 1) Establishing connection with database
            Connection con =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            // 2) Creating Statement object
            Statement stmt =
                    con.createStatement();

            // 3) SQL Query to create table
            String query =
                    "CREATE TABLE students ("
                            + "id INT PRIMARY KEY, "
                            + "name VARCHAR(50), "
                            + "dob DATE, "
                            + "marks FLOAT"
                            + ")";

            // 4) Executing query
            stmt.executeUpdate(query);

            System.out.println(
                    "Table Created Successfully!"
            );

            // 5) Closing connection
            con.close();

        } catch (Exception e) {

            // Handling exceptions
            System.out.println(e);
        }
    }
} 
