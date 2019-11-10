package servlets;

import dao.*;
import models.Article;
import models.Comment;
import static helpers.FreemarkerHelper.render;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "PageArticleServlet")
public class PageArticleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArticleDAO ad = new ArticleDAOImpl();
        CommentDAO cd = new CommentDAOImpl();
        Map<String, Object> root = new HashMap<>();
        String id_check = request.getParameter("id");
        int id;
        try {
            id = Integer.parseInt(id_check);
        }
        catch (NumberFormatException e)
        {
            id = 0;
        }
        Article article = ad.getArticle(id);
        List<Comment> comments = cd.listOfComment(id);
        root.put("article",article);
        root.put("comments",comments);
        render(request,response,"article.ftl",root);

    }
}
