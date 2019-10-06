import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "ProfileAndFriendsServlet")
public class ProfileAndFriendsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Profile> profiles = new FriendsDAO().getFriendsById(request.getParameter("id"));
        Profile p = new ProfileDAO().getUserById(request.getParameter("id"));
        PrintWriter writer = response.getWriter();
        writer.println("<!DOCTYPE html>"
                + "<html>" +
                "<head>" +
                "<meta charset= UTF-8>" +
                "<title>SayHello</title>" +
                "</head>" +
                "<body>");
        for (Profile profile : profiles) {
            writer.println(profile.getName());
        }
        writer.println(p.getName() + "</body>" +
                "</html>");
        writer.flush();
        writer.close();
    }
}