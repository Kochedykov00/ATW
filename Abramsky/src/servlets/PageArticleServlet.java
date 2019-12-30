package servlets;

import dao.*;
import models.Article;
import models.Comment;
import models.User;

import static helpers.FreemarkerHelper.render;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "PageArticleServlet")
public class PageArticleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArticleDAO ad = new ArticleDAOImpl();
        CommentDAO cd = new CommentDAOImpl();
        String text = request.getParameter("input");
        String submitType = request.getParameter("submit");
        String s = request.getParameter("rating");


        String id_check = request.getParameter("id");
        int id;
        try {
            id = Integer.parseInt(id_check);
        } catch (NumberFormatException e) {
            id = 0;
        }
        Article artic = ad.getArticle(id);
        Cookie[] cookies = request.getCookies();
        HttpSession session = request.getSession();
        Integer current = (Integer) session.getAttribute("current_user");
        String cur = current.toString();

        try {
            if (s.equals("plus")) {
                int status = 0;
                for (Cookie cookie : cookies) {
                    if (cookie.getValue().equals(id_check) && cookie.getName().equals(cur)) {
                        status += 1;
                    }
                }
                if (status == 0) {
                    Article article = new Article(artic.getUser_id(), artic.getTitle_id(), artic.getAuthor(), artic.getTitle(), artic.getText(), artic.getDate(), artic.getRating() + 1, artic.getPhotoPath());
                    int st = ad.updateArticle(article, artic.getTitle_id());
                    Cookie cookie = new Cookie(cur, id_check);
                    cookie.setMaxAge(Integer.MAX_VALUE);
                    response.addCookie(cookie);
                    response.sendRedirect("/article?id=" + id_check);
                } else {
                    response.sendRedirect("/article?id=" + id_check);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("не плюс");
        }

        try {

            if (submitType.equals("save") && text != null) {


                Integer id_user = (Integer) session.getAttribute("current_user");
                UserDAO ud = new UserDAOImpl();
                User u = ud.getUserById(id_user);
                Comment comment = new Comment();
                comment.setId_article(artic.getTitle_id());
                comment.setId_author(id_user);
                comment.setName_author(u.getUsername());
                comment.setText(text);
                int status = cd.addComment(comment);
                response.sendRedirect("/article?id=" + id_check);
            }
        } catch (NullPointerException e) {
            System.out.println("не сейф");
        }

    }







    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArticleDAO ad = new ArticleDAOImpl();
        CommentDAO cd = new CommentDAOImpl();

        String id_check = request.getParameter("id");
        int id;
        try {
            id = Integer.parseInt(id_check);
        }
        catch (NumberFormatException e)
        {
            id = 0;
        }
        Article article = ad.getArticle(id);





        Map<String, Object> root = new HashMap<>();


        List<Comment> comments = cd.listOfCommentByArticle(id);

        root.put("article",article);
        root.put("comments",comments);




                render(request,response,"article.ftl",root);

    }
}
