package servlets;

import dao.ArticleDAO;
import dao.ArticleDAOImpl;
import dao.UserDAO;
import dao.UserDAOImpl;
import models.Article;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import static helpers.FreemarkerHelper.render;

import java.util.List;
import java.util.Map;

@WebServlet(name = "MainServlet")
public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Integer user = (Integer) session.getAttribute("current_user");
        String id_check = request.getParameter("id");

        ArticleDAOImpl ad = new ArticleDAOImpl();
        List<Article> articles = ad.selectTopRating();
        List<Article> article = ad.selectTopDate();
        Map<String, Object> root = new HashMap<>();
        root.put("articleTopRating", articles);
        root.put("articleTopDate",article);
        render(request,response,"articles.ftl",root);

    }
}
