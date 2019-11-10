package servlets;

import dao.BlogDAO;
import dao.BlogDAOImpl;
import dao.UserDAO;
import dao.UserDAOImpl;
import models.Blog;
import models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static helpers.FreemarkerHelper.render;

@WebServlet(name = "ProfileServlet")
public class ProfileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDAO ud = new UserDAOImpl();
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
        User user = ((UserDAOImpl) ud).getUserById(id);

        BlogDAO bd = new BlogDAOImpl();
        Blog blog = bd.getBlogById(id);
            root.put("bloger", blog);

        root.put("profile", user);

        render(request, response, "profile.ftl", root);
    }
}
