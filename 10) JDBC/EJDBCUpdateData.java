// JDBC Program to Update Data in MySQL Table

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EJDBCUpdateData {

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

            // 3) SQL Update Query
            String query1 =
                    "UPDATE students " +
                    "SET marks = 95 " +
                    "WHERE name = 'Stuti'";

           String query2 =
                    "UPDATE students " +
                    "SET marks = 100 " +
                    "WHERE id = '1'"; // Updating with id = 1 (Saiyam)

            // 4) Execute query
            int row1 =
                    stmt.executeUpdate(query1);

            System.out.println(
                    row1 + " Row1 Updated Successfully!"
            );

            int row2 =
                    stmt.executeUpdate(query2);

            System.out.println(
                    row2 + " Row2 Updated Successfully!"
            );

            // 5) Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}