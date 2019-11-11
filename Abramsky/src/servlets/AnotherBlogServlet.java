package servlets;


import dao.BlogDAO;
import dao.BlogDAOImpl;
import models.Article;
import models.Blog;
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

@WebServlet(name = "AnotherBlogServlet")
public class AnotherBlogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, Object> root = new HashMap<>();
        String id_check = request.getParameter("id");

        int id;
        try {
            id = Integer.parseInt(id_check);
        }
        catch (NumberFormatException e)
        {
            id = 0;
        }
        BlogDAO bd = new BlogDAOImpl();
        Blog blog = bd.getBlogById(id);



            root.put("blog", blog);


        render(request,response,"anotherBlog.ftl",root);

    }
}
