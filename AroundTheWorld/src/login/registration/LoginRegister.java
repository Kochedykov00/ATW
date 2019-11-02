package login.registration;


import javax.servlet.annotation.WebServlet;
import java.io.IOException;

import static login.registration.Freemarker.render;


@WebServlet("/LoginRegister")
public class LoginRegister extends javax.servlet.http.HttpServlet {

    public  LoginRegister(){
        super();
    }


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        CustomerDAO cd = new CustomerDAOimpl();
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String submitType = request.getParameter("submit");
        Customer c = cd.getCustomer(userName,password);
        if (submitType.equals("login") && c != null && c.getName() != null ){
            request.setAttribute("message",c.getName());
            request.getRequestDispatcher("welcome.jsp").forward(request,response);
        }
        else if (submitType.equals("registration")) {
            c = new Customer();
            c.setUsername(request.getParameter("username"));
            c.setPassword(request.getParameter("password"));
            c.setName(request.getParameter("name"));
            cd.insertCustomer(c);
            request.setAttribute("successMessage","register has been completed");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }

        else {
            request.setAttribute("message", "Error, please click on registration");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        render(request, response, "login.ftl", null);
    }
}
