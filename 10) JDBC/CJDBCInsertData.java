// JDBC Program to Insert Data into MySQL Table

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CJDBCInsertData {

    public static void main(String[] args) {

        // Database URL
        String url = "jdbc:mysql://localhost:3306/studentdb";

        // Database Credentials
        String username = "root";
        String password = "Saiyam";

        try {

            // 1) Establish connection
            Connection con =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            // 2) Create Statement object
            Statement stmt =
                    con.createStatement();

            // 3) SQL Insert Query
            String query =
                    "INSERT INTO students VALUES "
                    + "(1,'Saiyam','2006-08-20',98)";

            // 4) Execute query
            int rows =
                    stmt.executeUpdate(query);

            System.out.println(
                    rows + " Row Inserted Successfully!"
            );

            // 5) Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}