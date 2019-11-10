package servlets;

import dao.UserDAO;
import dao.UserDAOImpl;
import models.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static helpers.FreemarkerHelper.render;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    public LoginServlet() {
        super();
    }


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        UserDAO ud = new UserDAOImpl();
        String userName = request.getParameter("login");
        String password = request.getParameter("password");
        String submitType = request.getParameter("submit");
        //String checkboxType = request.getParameter("login");
        User u = ud.getUser(userName, password);
        HttpSession session = request.getSession();
        Integer user = (Integer) session.getAttribute("current_user");




        if (user != null) {
            response.sendRedirect("/main");
        }
        else if (submitType.equals("login") && u != null && u.getUsername() != null) {
            session.setAttribute("current_user", u.getId());
            response.sendRedirect("/main");

        } else {
            response.sendRedirect("/register");
        }
    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse
            response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();
        UserDAO ud = new UserDAOImpl();
        Integer user = (Integer) session.getAttribute("current_user");



        if (user != null) {
            response.sendRedirect("/main");
        } else {
            render(request, response, "login.ftl", null);
        }
    }
}




