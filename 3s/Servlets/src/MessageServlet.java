import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "MessageServlet")
public class MessageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Message> messages = MessageDAO.getMessagesById(request.getParameter("id1"),request.getParameter("id2"));

        PrintWriter writer = response.getWriter();
        writer.println("<!DOCTYPE html>"
                + "<html>" +
                "<head>" +
                "<meta charset= UTF-8>" +
                "<title>SayHello</title>" +
                "</head>" +
                "<body>");
        for (Message m : messages) {
            writer.println(m.getText());
        }
        writer.println("</body>" +
                "</html>");
        writer.flush();
        writer.close();
    }
}

