package servlets;

import dao.UserDAO;
import dao.UserDAOImpl;
import models.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static helpers.FreemarkerHelper.render;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    public LoginServlet() {
        super();
    }


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        UserDAO ud = new UserDAOImpl();
        String userName = request.getParameter("login");
        String password = request.getParameter("password");
        String submitType = request.getParameter("submit");
        String checkbox = request.getParameter("rememberMe");

        MessageDigest messageDigest = null;
        byte[] digest = new byte[0];

        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(request.getParameter("password").getBytes());
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

        User u = ud.getUser(userName, md5Hex);
        HttpSession session = request.getSession();
        Cookie[] cookies = request.getCookies();



        if (submitType.equals("login") && u != null && u.getUsername() != null && checkbox != null) {
            Integer id_user = u.getId();
            System.out.println("checkboooooox");
            session.setAttribute("current_user", u.getId());
            int status = 0;
            for (Cookie cookie : cookies) {
                if (id_user.toString().equals(cookie.getValue())) {
                    System.out.println("verifyyyyyyyyyy");
                    response.sendRedirect("/main");
                    status += 1;
                }
            }
            if (status == 0) {
                Cookie cookie = new Cookie("rememberMe", id_user.toString());
                System.out.println("new cookie");
                cookie.setMaxAge(Integer.MAX_VALUE);
                response.addCookie(cookie);
                response.sendRedirect("/main");
            }
        }
        else {
            if (submitType.equals("login") && u != null && u.getUsername() != null && checkbox == null) {
                System.out.println("nocheckK");
                session.setAttribute("current_user", u.getId());
                response.sendRedirect("/main");

            } else {
                System.out.println("regiiiistr");
                response.sendRedirect("/register");

            }
        }
    }



    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse
            response) throws javax.servlet.ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        HttpSession session = request.getSession();

        for (Cookie cookie: cookies) {
            if (cookie.getName().equals("rememberMe")) {
                String id = cookie.getValue();
                session.setAttribute("current_user" , Integer.parseInt(id));
                response.sendRedirect("/main");
            }
        }

            render(request, response, "login.ftl", null);

    }
}




