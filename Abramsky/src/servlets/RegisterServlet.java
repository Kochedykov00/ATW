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

import static helpers.FreemarkerHelper.render;

@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserDAO customerDAO = new UserDAOImpl();

        User u ;


            u = new User();
            u.setUsername(request.getParameter("username"));
            u.setPassword(request.getParameter("password"));
            u.setLastName(request.getParameter("lastname"));
            u.setEmail(request.getParameter("email"));
            u.setFirstName(request.getParameter("firstname"));
            int status = customerDAO.insertUser(u);
            //request.setAttribute("successMessage","register has been completed");
            response.sendRedirect("/login");
        }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        render(request, response, "register.ftl", null);
    }
}
