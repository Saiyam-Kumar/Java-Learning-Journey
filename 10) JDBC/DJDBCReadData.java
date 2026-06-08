// JDBC Program to Read Data from MySQL Table

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DJDBCReadData {
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

            // 3) Execute SELECT Query
            ResultSet rs =
                    stmt.executeQuery(
                            "SELECT * FROM students"
                    );

            System.out.println("Student Records:\n");

            // 4) Read records one by one
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                java.sql.Date dob = rs.getDate("dob");
                float marks = rs.getFloat("marks");

                System.out.println(
                        id + " | "
                                + name + " | "
                                + dob + " | "
                                + marks
                );
            }

            // 5) Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}