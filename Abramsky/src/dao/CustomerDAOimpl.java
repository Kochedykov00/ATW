package dao;

import helpers.Database;
import models.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDAOimpl implements CustomerDAO {
    static Connection con;
    static PreparedStatement ps;
    public int insertCustomer(Customer c) {
        int status = 0;
        try {
            con = Database.getConnection();
            ps = con.prepareStatement("insert into users (username,name,password) values (?,?,?)");
            ps.setString(1, c.getUsername());
            ps.setString(2, c.getName());
            ps.setString(3, c.getPassword());
            status = ps.executeUpdate();
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }

        return status;
    }

    public Customer getCustomer (String username, String password) {
        Customer c = new Customer();
        try {
            con= Database.getConnection();
            ps = con.prepareStatement("select * from users where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                c.setUsername(rs.getString(1));
                c.setPassword(rs.getString(2));
                c.setName(rs.getString(3));

            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return c;
    }
}

