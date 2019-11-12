package dao;

import helpers.Database;
import models.Article;
import models.Blog;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BlogDAOImpl implements BlogDAO {

    public Blog getBlogById(int id_blog) {
        try {
            Connection conn = helpers.Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "select * from blogs where id_blog= ?"
            );
            ps.setInt(1, id_blog);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Blog(
                        rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    public Blog getBlogByIdAuthor(int id_author) {
        try {
            Connection conn = helpers.Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "select * from blogs where id_author= ?"
            );
            ps.setInt(1, id_author);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Blog(
                        rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    public List<Article> getListOfArticleByIdOfAuthor(int id_user) {
        try {
            List<Article> articles = new ArrayList<>();
            Connection conn = helpers.Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "select * from articles where user_id =?"
            );
            ps.setInt(1, id_user);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                articles.add(new Article(
                        rs.getInt(1), rs.getInt(8), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7)
                ));

            }
            return articles;
        } catch (NullPointerException e) {
            e.printStackTrace();

        }
        catch (SQLException s) {
            s.printStackTrace();
        }
        return null;
    }

    public int createBlog(Blog blog) {
        int status = 0;
        try {
            Connection con;
            PreparedStatement ps;
            con = Database.getConnection();
            ps = con.prepareStatement("insert into blogs (id_author, name, description) values (?,?,?)");
            ps.setInt(1, blog.getId_author());
            ps.setString(2, blog.getName());
            ps.setString(3, blog.getDescription());


            status = ps.executeUpdate();
            con.close();


            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}


