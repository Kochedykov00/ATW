package servlets;

import dao.StudentDAOImpl;
import dao.UserDAO;
import dao.UserDAOImpl;
import models.Student;
import models.User;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;
import java.io.*;
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

        u = ((UserDAOImpl) ud).getUserById(id);
        System.out.println(u.getUsername()+ u.getFirstName()+ u.getAboutme());
        String username = request.getParameter("username");
        u.setUsername(username);
        System.out.println(u.getUsername());

        String firstname = request.getParameter("firstname");
        u.setFirstName(firstname);

        String lastname = request.getParameter("lastname");
        u.setLastName(lastname);

        String aboutme = request.getParameter("aboutme");
        u.setAboutme(aboutme);

        Part p = request.getPart("photo");

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
        u.setPhotoPath("/" + localdir + "/" + filename);
        User user = new User (u.getId(),u.getFirstName(),u.getLastName(),u.getEmail(),u.getUsername(),u.getPassword(),u.getPhotoPath(),u.getAboutme());


        ((UserDAOImpl) ud).updateUser(id,user);
        response.sendRedirect("/profile");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        render(request, response, "new.ftl", null);
    }
}
