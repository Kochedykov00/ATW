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
        session.setAttribute("current_user", u.getId());
        Integer user = (Integer) session.getAttribute("current_user");
        Cookie[] cookies = request.getCookies();
        Integer n = u.getId();
        for (Cookie c : cookies) {
            if (c.getValue().equals("remember")) {
                response.sendRedirect("/profile");

            } else {
                if (submitType.equals("login") && u != null && u.getUsername() != null) {
                    Cookie cookie = new Cookie(n.toString(), "remember");
                    cookie.setMaxAge(70);
                    response.sendRedirect("/profile");

                } else {
                    response.sendRedirect("/register");
                }
            }
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse
            response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();
        Integer user = (Integer) session.getAttribute("current_user");
         /*   Cookie[] cookies = request.getCookies();
            int count = 0;
            for (Cookie cookie : cookies) {
                if (user.toString().equals(cookie.getName())) {
                    response.sendRedirect("/profile");
                    count += 1;
                }
            }
            if (count != 0) {
                render(request, response, "login.ftl", null);
            }
        }
        */

        if (user != null) {
            response.sendRedirect("/profile");
        } else {
            render(request, response, "login.ftl", null);
        }


    }
}

