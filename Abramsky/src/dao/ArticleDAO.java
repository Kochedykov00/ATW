package dao;

import models.Article;


import java.util.ArrayList;
import java.util.List;

public interface ArticleDAO {

    public List<Article> allArticles(int id);
    public int insertArticle(Article a);
    public Article getArticle(int id);
    public List<Article> selectTopRating ();
    public List<Article> selectTopDate ();
}
