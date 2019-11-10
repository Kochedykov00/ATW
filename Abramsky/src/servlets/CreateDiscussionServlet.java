package servlets;

import dao.ForumDAO;
import dao.ForumDAOImpl;
import dao.UserDAO;
import dao.UserDAOImpl;
import models.Forum;
import models.User;
import static helpers.FreemarkerHelper.render;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "CreateDiscussionServlet")
public class CreateDiscussionServlet extends HttpServlet {
    UserDAO ud = new UserDAOImpl();
    ForumDAO fd = new ForumDAOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String text = request.getParameter("text");
        Forum forum = new Forum();
        forum.setName(name);
        forum.setText(text);
        HttpSession session = request.getSession();
        Integer id_user = (Integer) session.getAttribute("current_user");
        forum.setId_author(id_user);
        User user = ud.getUserById(id_user);
        forum.setAuthor(user.getUsername());
        Date date = new Date();
        forum.setDate(date);
        int status = fd.insertDiscussion(forum);
        response.sendRedirect("/discussions");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        render(request,response,"create_discussion.ftl",null);
    }
}
