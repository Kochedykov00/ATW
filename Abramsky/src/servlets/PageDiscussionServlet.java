package servlets;

import dao.CommentDAO;
import dao.CommentDAOImpl;
import dao.ForumDAO;
import dao.ForumDAOImpl;
import models.Article;
import models.Comment;
import models.Forums;
import static helpers.FreemarkerHelper.render;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "PageDiscussionServlet")
public class PageDiscussionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id_check = request.getParameter("id");
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
        Map<String,Object> root = new HashMap<>();
        root.put("forum",forums);
        render(request,response,"discussion.ftl",root);
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
