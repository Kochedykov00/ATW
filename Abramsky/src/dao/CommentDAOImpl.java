package dao;

import helpers.Database;
import models.Article;
import models.Comment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommentDAOImpl implements CommentDAO {

    static Connection con;
    static PreparedStatement ps;

    public List<Comment> listOfCommentByArticle (int id_article) {
        try {
            Connection conn = helpers.Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "select * from comments where id_article =?"
            );
            ps.setInt(1,id_article);
            ResultSet rs = ps.executeQuery();
            List<Comment> comments = new ArrayList<>();
            while (rs.next()) {
                comments.add(new Comment(
                        rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5)
                ));

            }
            conn.close();
            return comments;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }


    public List<Comment> listOfCommentByDiscussion (int id_discussion) {
        try {
            Connection conn = helpers.Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "select * from comments where id_discussion =?"
            );
            ps.setInt(1,id_discussion);
            ResultSet rs = ps.executeQuery();
            List<Comment> comments = new ArrayList<>();
            while (rs.next()) {
                comments.add(new Comment(
                        rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5)
                ));
                conn.close();

            }
            return comments;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    public int addComment (Comment comment) {
        int status = 0;
        try {


            con = Database.getConnection();
            ps = con.prepareStatement("insert into comments (id_author,name_author,id_article,text) values (?,?,?,?)");
            ps.setInt(1, comment.getId_author());
            ps.setString(2, comment.getName_author());
            ps.setInt(3, comment.getId_article());
            ps.setString(4, comment.getText());

            status = ps.executeUpdate();
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }

        return status;
    }

    public int addCommentByDiscussion (Comment comment) {
        int status = 0;
        try {


            con = Database.getConnection();
            ps = con.prepareStatement("insert into comments (id_author,name_author,id_discussion,text) values (?,?,?,?)");
            ps.setInt(1, comment.getId_author());
            ps.setString(2, comment.getName_author());
            ps.setInt(3, comment.getId_discussion());
            ps.setString(4, comment.getText());

            status = ps.executeUpdate();
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }

        return status;
    }
}

