package dao;

import helpers.Database;
import models.User;


import java.sql.*;

public class UserDAOImpl implements UserDAO {
    static Connection con;
    static PreparedStatement ps;
    public int insertUser(User u) {
        int status = 0;
        try {
            con = Database.getConnection();
            ps = con.prepareStatement("insert into users (username,firstname,lastname,email,password) values (?,?,?,?,?)");
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getFirstName());
            ps.setString(3, u.getLastName());
            ps.setString(4, u.getEmail());
            ps.setString(5, u.getPassword());

            status = ps.executeUpdate();
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }

        return status;
    }

    public void updateUser(Integer id, User u) {
        int status = 0;
        try {

            con = Database.getConnection();
            String value = id.toString();
            String query =  "UPDATE   users SET username=?, firstname=?, lastname=?, aboutme=?, photo_path=? WHERE id ="+value;
            ps = con.prepareStatement(query);
            //ResultSet rs = ps.executeQuery();
            //while (rs.next()) {
               // rs.updateString(5,u.getUsername());
                //rs.updateString(2, u.getFirstName());
                //rs.updateString(3, u.getLastName());
                //rs.updateString(8, u.getAboutme());
                //rs.updateString(7, u.getPhotoPath());
                ps.setString(1,u.getUsername());
                ps.setString(2,u.getFirstName());
                ps.setString(3,u.getLastName());
                ps.setString(4,u.getAboutme());
                ps.setString(5,u.getPhotoPath());
                status = ps.executeUpdate();
                con.close();

            //ps.executeUpdate();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    public User getUserById(int id) {
        try {
            Connection conn = helpers.Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "select * from users where id = ?"
            );
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new User(
                        rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5),rs.getString(6), rs.getString(7),rs.getString(8)
                );
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    public User getUser (String username, String password) {
        User u = new User();
        try {
            con= Database.getConnection();
            ps = con.prepareStatement("select * from users where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                u.setId(rs.getInt(1));
                u.setFirstName(rs.getString(2));
                u.setLastName(rs.getString(3));
                u.setEmail(rs.getString(4));
                u.setUsername(rs.getString(5));
                u.setPassword(rs.getString(6));

            }
            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return u;
    }
}

