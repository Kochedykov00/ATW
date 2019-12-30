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
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
        MessageDigest messageDigest = null;
        byte[] digest = new byte[0];



            u.setUsername(request.getParameter("username"));
            u.setLastName(request.getParameter("lastname"));
            u.setFirstName(request.getParameter("firstname"));
            u.setPassword(request.getParameter("password"));
            u.setEmail(request.getParameter("email"));

            //request.setAttribute("successMessage","register has been completed");



        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(u.getPassword().getBytes());
            digest = messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            // тут можно обработать ошибку
            // возникает она если в передаваемый алгоритм в getInstance(,,,) не существует
            e.printStackTrace();
        }

        BigInteger bigInt = new BigInteger(1, digest);
        String md5Hex = bigInt.toString(16);

        while( md5Hex.length() < 32 ){
            md5Hex = "0" + md5Hex;
        }

        u.setPassword(md5Hex);
        int status = customerDAO.insertUser(u);
        response.sendRedirect("/login");
        }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        render(request, response, "register.ftl", null);
    }
}
