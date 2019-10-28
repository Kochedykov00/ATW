package login.registration;

import javax.servlet.http.HttpSession;
import java.io.IOException;



@javax.servlet.annotation.WebServlet(name = "LoginRegister", urlPatterns = {"/*"})
public class LoginRegister extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        CustomerDAO cd = new CustomerDAOimpl();
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String submitType = request.getParameter("submit");
        Customer c = cd.getCustomer(userName,password);
        if (submitType.equals("login") && c != null && c.getName() != null ){
            HttpSession session = request.getSession();
            session.setAttribute("message", c.getName());
            response.sendRedirect("welcome.jsp");
        }
        else if (submitType.equals("register")) {
            c.setName(request.getParameter("name"));
            c.setName(request.getParameter(userName));
            c.setName(request.getParameter(password));
            cd.insertCustomer(c);
            HttpSession session = request.getSession();
            session.setAttribute ("successMessage", "not found");
            response.sendRedirect("register.jsp");
        }

        else {
            request.setAttribute("message", "Error, please click on registration");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
