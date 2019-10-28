package login.registration;

import java.io.IOException;



@javax.servlet.annotation.WebServlet(name = "LoginRegister")
public class LoginRegister extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        CustomerDAO cd = new CustomerDAOimpl();
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String submitType = request.getParameter("submit");
        Customer c = cd.getCustomer(userName,password);
        if (submitType.equals("login") && c != null && c.getName() != null ){
            request.setAttribute("message", c.getName());
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        }
        else if (submitType.equals("register")) {
            c.setName(request.getParameter("name"));
            c.setName(request.getParameter(userName));
            c.setName(request.getParameter(password));
            cd.insertCustomer(c);
            request.setAttribute("successMessage", "not found");
            request.getRequestDispatcher("register.jsp").forward(request,response);
        }

        else {
            request.setAttribute("message", "Error, please click on registration");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
