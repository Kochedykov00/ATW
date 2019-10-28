package login.registration;

import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnectionProvider implements MyProvider {

    static Connection con = null;

    public static Connection getCon() {
        try {
            Class.forName("org.postgressql.Driver");
            con= DriverManager.getConnection(connUrl,username,password);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return con;

    }
}
