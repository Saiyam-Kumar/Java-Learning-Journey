//JDBC -> Java Database Connectivity (Helps Java to talk to the database)
//API that allows java applications to communicate with databases such as MySQL,Oracle.
//Perform CRUD operations(Create,Read,Update,Delete)

//1) Importing Packages
import java.sql.Connection;
import java.sql.DriverManager;

public class AJDBCConnection {
    public static void main(String[] args) {
    //2) Loading JDBC Driver
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "Saiyam";

        try {
        //3) Opening a con to a database
            Connection con =
                DriverManager.getConnection(
                    url,
                    username,
                    password
                );

            System.out.println(
                "Database Connected Successfully!"
            );

            con.close();
        }

        catch(Exception e) {
            System.out.println(e);
        }
    }
}
