package dao;

import models.Article;
import models.Blog;

import java.util.List;

public interface BlogDAO {

    public Blog getBlogById(int id);
    public List<Article> getListOfArticleByIdOfAuthor (int id_user);
    public int createBlog (Blog blog);
    public Blog getBlogByIdAuthor(int id_author);
}
