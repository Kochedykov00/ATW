import java.sql.*;

public class MainOfDB {

    public static void main(String [] args) throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/users",
                "postgres",
                "otumer58"
        );

        Statement stmnt = conn.createStatement();
        ResultSet rs = stmnt.executeQuery("select * from mail.profiles");
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }

    }
}
