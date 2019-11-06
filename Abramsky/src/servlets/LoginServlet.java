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
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String submitType = request.getParameter("submit");
        String checkboxType = request.getParameter("option");
        User u = ud.getUser(userName, password);
        HttpSession session = request.getSession();
        //session.setAttribute("current_user", u.getId());
        Cookie[] cookies = request.getCookies();
        Integer n = u.getId();
        for (Cookie cookie : cookies) {
            if (cookie.getValue().equals("remember")) {
                response.sendRedirect("/main");
            }
        }
        if (submitType.equals("login") && u != null && u.getUsername() != null) {
            session.setAttribute("current_user", u.getId());
            Integer user = (Integer) session.getAttribute("current_user");
            Cookie cookie1 = new Cookie(user.toString(), "remember");
            cookie1.setMaxAge(-1);
            response.sendRedirect("/main");

        } else {
            response.sendRedirect("/register");
        }
    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse
            response) throws javax.servlet.ServletException, IOException {
        //HttpSession session = request.getSession();
        //Integer user = (Integer) session.getAttribute("current_user");
        Cookie[] cookies = request.getCookies();
        int status = 0;
        for (Cookie cookie : cookies) {
            if (cookie.getValue().equals("remember")) {
                status += 1;
            }
        }
        if (status != 0) {
            response.sendRedirect("/main");
        } else {
            render(request, response, "login.ftl", null);

        }
    }
}
        /*

        if (user != null) {
            response.sendRedirect("/profile");
        } else {
            render(request, response, "login.ftl", null);
        }
        */



