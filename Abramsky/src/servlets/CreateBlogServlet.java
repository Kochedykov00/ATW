package servlets;

import dao.BlogDAO;
import dao.BlogDAOImpl;
import models.Blog;
import static helpers.FreemarkerHelper.render;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
@MultipartConfig
@WebServlet(name = "CreateBlogServlet")
public class CreateBlogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        Blog blog = new Blog();
        blog.setName(name);
        blog.setDescription(description);
        blog.setId_blog(1);
        HttpSession session = request.getSession();
        Integer id_user = (Integer) session.getAttribute("current_user");
        System.out.println("айди юзер" + id_user);
        if (id_user != null) {
            blog.setId_author(id_user);
            BlogDAO bd = new BlogDAOImpl();

            bd.createBlog(blog);
            response.sendRedirect("/blog");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        render(request,response,"create_blog.ftl",null);
    }
}
