package servlets;

import dao.*;
import models.*;

import static helpers.FreemarkerHelper.render;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "PageDiscussionServlet")
public class PageDiscussionServlet extends HttpServlet {
    CommentDAO cd = new CommentDAOImpl();
    ForumDAO fd = new ForumDAOImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id_check = request.getParameter("id");
        String text = request.getParameter("input");
        String submitType = request.getParameter("submit");
        int id;
        try {
            id = Integer.parseInt(id_check);
        }
        catch (NumberFormatException e)
        {
            id = 0;
        }

        Forums forum = fd.getForumById(id);

        if (submitType.equals("save") && text !=null) {

            HttpSession session = request.getSession();
            Integer id_user = (Integer) session.getAttribute("current_user");
            UserDAO ud = new UserDAOImpl();
            User u = ud.getUserById(id_user);
            Comment comment = new Comment();
            comment.setId_discussion(forum.getId());
            comment.setId_author(id_user);
            comment.setName_author(u.getUsername());
            comment.setText(text);
            int status = cd.addCommentByDiscussion(comment);
            response.sendRedirect("/discussion?id="+id_check);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id_check = request.getParameter("id");
        CommentDAO cd = new CommentDAOImpl();
        int id;
        try {
            id = Integer.parseInt(id_check);
        }
        catch (NumberFormatException e)
        {
            id = 0;
        }
            ForumDAO fd = new ForumDAOImpl();
            Forums forums = fd.getForumById(id);

        List<Comment> comments = cd.listOfCommentByDiscussion(id);
            Map<String,Object> root = new HashMap<>();
            root.put("forum",forums);
            root.put("comments",comments);
            render(request,response,"discussion.ftl",root);





    }
}
