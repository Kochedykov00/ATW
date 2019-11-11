package servlets;

import static helpers.FreemarkerHelper.render;
import dao.BlogDAO;
import dao.BlogDAOImpl;
import models.Article;
import models.Articles;
import models.Blog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "MyBlogServlet")
public class MyBlogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Integer user = (Integer) session.getAttribute("current_user");
        BlogDAO bd = new BlogDAOImpl();
        Blog blog = bd.getBlogById(user.intValue());
        List<Article> articles = bd.getListOfArticleByIdOfAuthor(user.intValue());
        Map<String, Object> root = new HashMap<>();
        root.put ("blog",blog);
        root.put("article",articles);
        render(request, response, "blog.ftl", root );
    }
}
