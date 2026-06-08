// JDBC Program to Delete Data from MySQL Table

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FJDBCDeleteData {

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

            // 3) SQL Delete Query
            String query =
                    "DELETE FROM students " +
                    "WHERE id = 4";

            // 4) Execute query
            int rows =
                    stmt.executeUpdate(query);

            System.out.println(
                    rows + " Row Deleted Successfully!"
            );

            // 5) Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}