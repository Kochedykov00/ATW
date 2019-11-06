package servlets;

import dao.UserDAO;
import dao.UserDAOImpl;
import models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static helpers.FreemarkerHelper.render;

@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserDAO customerDAO = new UserDAOImpl();

        User u ;
        u = new User();
        String patternEmail = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
        String PatternPassword = "^[a-z0-9]+";

        Pattern pattern = Pattern.compile(patternEmail);
        Pattern pattern1 = Pattern.compile(PatternPassword);

        Matcher m1 = pattern.matcher(request.getParameter("email"));
        Matcher m2 = pattern1.matcher(request.getParameter("password"));

        if (m1.find()) {
            u.setEmail(request.getParameter("email"));
        }
        else {
            response.sendRedirect("/register");
        }

        if (m2.find()) {
            u.setPassword(request.getParameter("password"));
        }
        else {
            response.sendRedirect("/register");
        }

            u.setUsername(request.getParameter("username"));
            u.setLastName(request.getParameter("lastname"));
            u.setFirstName(request.getParameter("firstname"));
            int status = customerDAO.insertUser(u);
            //request.setAttribute("successMessage","register has been completed");
            response.sendRedirect("/login");
        }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        render(request, response, "register.ftl", null);
    }
}
