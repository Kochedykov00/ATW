package dao;

import helpers.Database;
import models.Article;
import models.Articles;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAOImpl implements ArticleDAO {

    public List<Article> allArticles(int id) {
        try {
            Connection conn = helpers.Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "select * from articles where id =?"
            );
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            List<Article> articles = new ArrayList<>();
            while (rs.next()) {
                articles.add(new Article(
                        rs.getInt(1), rs.getInt(8), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),rs.getString(7)
                ));

            }
            return articles;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    public List<Article> selectTopRating () {
        try {
            List<Article> articles = new ArrayList<>();
            Connection conn = helpers.Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM articles ORDER BY rating DESC LIMIT 5;"
            );
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                articles.add(new Article(
                        rs.getInt(1), rs.getInt(8), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),rs.getString(7)
                ));
            }
            return articles;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    public List<Article> selectTopDate () {
        try {
            List<Article> articles = new ArrayList<>();
            Connection conn = helpers.Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM articles order  by id_title desc LIMIT 5;"
            );
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                articles.add(new Article( rs.getInt(1), rs.getInt(8), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),rs.getString(7)
                ));

            }
            return articles;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }



    public int insertArticles(Articles a) {
    int status = 0;
        try {
            Connection conn ;
        conn = Database.getConnection();
        String date = a.getDate().toString();
        PreparedStatement ps = conn.prepareStatement("insert into articles (user_id,author,title,text,date,rating,photopath) values (?,?,?,?,?,?,?)");
        ps.setInt(1, a.getUser_id());
        ps.setString(2, a.getAuthor());
        ps.setString(3, a.getTitle());
        ps.setString(4, a.getText());
        ps.setString(5, date);
        ps.setInt(6, a.getRating());
        ps.setString(7,a.getPhotoPath());

        status = ps.executeUpdate();
        conn.close();
    }
        catch(Exception e) {
        System.out.println(e);
    }

        return status;
}

    public int updateArticle(Article a, Integer id) {
        int status = 0;
        try {
            Connection conn ;
            conn = Database.getConnection();
            String date = a.getDate().toString();
            PreparedStatement ps;
            String value = id.toString();
            String query =  "UPDATE   articles SET user_id=?, author=?, title=?, text=?, date=?, rating=?, photopath=? WHERE id_title ="+value;
            ps = conn.prepareStatement(query);
            ps.setInt(1, a.getUser_id());
            ps.setString(2, a.getAuthor());
            ps.setString(3, a.getTitle());
            ps.setString(4, a.getText());
            ps.setString(5, date);
            ps.setInt(6, a.getRating());
            ps.setString(7,a.getPhotoPath());

            status = ps.executeUpdate();
            conn.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }

        return status;
    }

    public Article getArticle(int id) {

        try {

            Connection conn = helpers.Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "select * from articles where id_title =?"
            );
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            Article article ;
            while (rs.next()) {
                article = new Article(
                        rs.getInt(1), rs.getInt(8), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),rs.getString(7)
                );
                return article;

            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }


}
