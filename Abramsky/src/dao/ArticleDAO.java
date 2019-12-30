package dao;

import models.Article;
import models.Articles;


import java.util.ArrayList;
import java.util.List;

public interface ArticleDAO {

    public List<Article> allArticles(int id);
    public int insertArticles(Articles a);
    public Article getArticle(int id);
    public List<Article> selectTopRating ();
    public List<Article> selectTopDate ();
    public int updateArticle(Article a, Integer id);
    public List<Article> getByLikePattern(String pattern);
}
