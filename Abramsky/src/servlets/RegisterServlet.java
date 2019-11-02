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

@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        CustomerDAO customerDAO = new CustomerDAOimpl();

        Customer cus ;


            cus = new Customer();
            cus.setUsername(request.getParameter("username"));
            cus.setPassword(request.getParameter("password"));
            cus.setName(request.getParameter("name"));
            int status = customerDAO.insertCustomer(cus);
            //request.setAttribute("successMessage","register has been completed");
            response.sendRedirect("/login");
        }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        render(request, response, "register.ftl", null);
    }
}
