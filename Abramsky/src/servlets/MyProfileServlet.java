package servlets;

import dao.BlogDAO;
import dao.BlogDAOImpl;
import dao.UserDAO;
import dao.UserDAOImpl;
import models.Blog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static helpers.FreemarkerHelper.render;

@WebServlet(name = "MyProfileServlet")
public class MyProfileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDAO ud = new UserDAOImpl();
        Map<String, Object> root = new HashMap<>();
        HttpSession session = request.getSession();
        Integer id = (Integer) session.getAttribute("current_user");
        //String submitType = request.getParameter("button");
        BlogDAO bd = new BlogDAOImpl();
        Blog blog = bd.getBlogById(id.intValue());



        root.put("profile", ((UserDAOImpl) ud).getUserById(id.intValue()));
        root.put("blog",blog);
        render(request, response, "myProfile.ftl", root);
    }
}
