package servlets;

import dao.ForumDAO;
import dao.ForumDAOImpl;
import models.Forum;
import models.Forums;

import static helpers.FreemarkerHelper.render;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ListOfDiscussionServlet")
public class ListOfDiscussionServlet extends HttpServlet {
    ForumDAO fd = new ForumDAOImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Forums> forums = fd.getAll();
        String id = request.getRequestURI();
        System.out.println(id);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Forums> forums = fd.getAll();
        Map<String,Object> root = new HashMap<>();
        root.put("discussions",forums);
        render(request,response,"discussions.ftl",root);
    }
}
