package servlets;

import dao.ArticleDAO;
import dao.ArticleDAOImpl;
import dao.UserDAO;
import dao.UserDAOImpl;
import models.Article;
import static helpers.FreemarkerHelper.render;
import models.Articles;
import models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "CreateArticleServlet")
public class CreateArticleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("text");
        System.out.println("название" + " " + name);
        Articles article = new Articles();
        article.setTitle(name);
        article.setText(description);
        article.setTitle_id(1);
        HttpSession session = request.getSession();
        Integer id_user = (Integer) session.getAttribute("current_user");
        UserDAO ud = new UserDAOImpl();
        User user = ud.getUserById(id_user.intValue());
        article.setAuthor(user.getUsername());

        article.setUser_id(id_user);
        Date date = new Date();
        article.setDate(date);
        article.setRating(0);


        ArticleDAO ad = new ArticleDAOImpl();
        int status = ad.insertArticles(article);
        response.sendRedirect("/myBlog");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        render(request,response,"createarticle.ftl",null);
    }
}
