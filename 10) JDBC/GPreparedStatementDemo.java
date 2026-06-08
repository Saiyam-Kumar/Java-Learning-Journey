/*
PreparedStatement is used to prevent SQL Injection attacks.
Instead of directly concatenating user input into SQL queries,
we use '?' placeholders and set values separately.

Unsafe Example:
String query = "SELECT * FROM users WHERE username='"
                + username + "'";

If a user enters:
' OR '1'='1

the query becomes:
SELECT * FROM users WHERE username='' OR '1'='1'

which can bypass authentication.

PreparedStatement treats input as data, not SQL code,
making the application more secure.

 */

// JDBC Program using PreparedStatement

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class GPreparedStatementDemo {

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

            // 2) Create PreparedStatement
            PreparedStatement ps =
                    con.prepareStatement(
                            "INSERT INTO students VALUES(?,?,?,?)"
                    );

            // 3) Set values
            ps.setInt(1, 5);
            ps.setString(2, "Priya");
            ps.setDate(
                    3,
                    Date.valueOf("2005-11-25")
            );
            ps.setFloat(4, 96);

            // 4) Execute query
            int rows =
                    ps.executeUpdate();

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