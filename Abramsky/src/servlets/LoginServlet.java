package servlets;

import dao.CustomerDAO;
import dao.CustomerDAOimpl;
import models.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static helpers.FreemarkerHelper.render;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    public  LoginServlet(){
        super();
    }


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        CustomerDAO cd = new CustomerDAOimpl();
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String submitType = request.getParameter("submit");
        Customer c = cd.getCustomer(userName,password);
        if (submitType.equals("login") && c != null && c.getUsername() != null){
            //request.setAttribute("message",c.getName());
            response.sendRedirect("/list");
        }

        else {

            response.sendRedirect("/register");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        render(request, response, "login.ftl", null);
    }
}
