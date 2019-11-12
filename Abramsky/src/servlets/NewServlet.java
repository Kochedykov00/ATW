package servlets;

import dao.StudentDAOImpl;
import dao.UserDAO;
import dao.UserDAOImpl;
import models.User;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;

import static helpers.FreemarkerHelper.render;

@MultipartConfig
public class NewServlet extends HttpServlet {

    private StudentDAOImpl studentDAO;

    @Override
    public void init() {
        studentDAO = new StudentDAOImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Integer id = (Integer) session.getAttribute("current_user");
        User u ;
        UserDAO ud = new UserDAOImpl();
        User update = new User();

        u = ((UserDAOImpl) ud).getUserById(id.intValue());
        System.out.println("тут ид" + id);
        String username = request.getParameter("login");
        if (username != null) {
            update.setUsername(username);
        }
        else {
            update.setUsername(u.getUsername());
        }

        String firstname = request.getParameter("name");
        if (firstname != null) {
            update.setFirstName(firstname);
        }
        else {
            update.setFirstName(u.getFirstName());
        }

        String lastname = request.getParameter("surname");
        if (lastname != null) {
            update.setLastName(lastname);
        }
        else {
            update.setLastName(u.getLastName());
        }

        String aboutme = request.getParameter("aboutMe");
        if (aboutme != null) {
            update.setAboutme(aboutme);
        }
        else {
            update.setAboutme(u.getAboutme());
        }

        Part p = request.getPart("photo");
        if (p != null) {

            String localdir = "uploads";
            String pathDir = getServletContext().getRealPath("") + File.separator + localdir;
            File dir = new File(pathDir);
            if (!dir.exists()) {
                dir.mkdir();
            }
            String[] filename_data = p.getSubmittedFileName().split("\\.");
            String filename = Math.random() + "." + filename_data[filename_data.length - 1];
            String fullpath = pathDir + File.separator + filename;
            p.write(fullpath);
            update.setPhotoPath("/" + localdir + "/" + filename);
        }
        else {
            update.setPhotoPath(u.getPhotoPath());
        }
        update.setId(u.getId());
        update.setPassword(u.getPassword());



        ((UserDAOImpl) ud).updateUser(id,update);
        response.sendRedirect("/myProfile");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Integer id = (Integer) session.getAttribute("current_user");
        User user ;
        UserDAO ud = new UserDAOImpl();
        user = ((UserDAOImpl) ud).getUserById(id.intValue());
        Map<String, Object> root = new HashMap<>();
        root.put ("user",user);
        render(request, response, "new.ftl", root);
    }
}
