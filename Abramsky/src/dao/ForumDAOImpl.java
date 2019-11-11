package dao;

import helpers.Database;
import models.Blog;
import models.Forum;
import models.Forums;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ForumDAOImpl implements ForumDAO{
    static Connection con;
    static PreparedStatement ps;


    public int insertDiscussion(Forum forum) {
        int status = 0;
        try {
            Date d = forum.getDate();
            String date = d.toString();
            con = Database.getConnection();
            ps = con.prepareStatement("insert into discussions (id_author,author,name,text,date) values (?,?,?,?,?)");
            ps.setInt(1, forum.getId_author());
            ps.setString(2, forum.getAuthor());
            ps.setString(3, forum.getName());
            ps.setString(4, forum.getText());
            ps.setString(5, date);

            status = ps.executeUpdate();
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }

        return status;
    }

    public List<Forums> getAll() {
        List<Forums> forums = new ArrayList<>();
        try {
            con = Database.getConnection();


            ps = con.prepareStatement("select * from discussions ");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String s = rs.getString(6);

                Forums forum = new Forums(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                forums.add(forum);

                con.close();
            }
            return forums;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }



        public Forums getForumById(int id) {
            try {
                Connection conn = helpers.Database.getConnection();
                PreparedStatement ps = conn.prepareStatement(
                        "select * from discussions where id= ?"
                );
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                Forums forums;
                while (rs.next()) {
                    forums =  new Forums(
                            rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)
                    );
                    return forums;
                }
            } catch (SQLException e) {
                e.printStackTrace();

            }
            return null;
        }

    }

