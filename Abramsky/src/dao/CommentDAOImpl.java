package dao;

import models.Article;
import models.Comment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommentDAOImpl implements CommentDAO {

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

            }
            return comments;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }
}
