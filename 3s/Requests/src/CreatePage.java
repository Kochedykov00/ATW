import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CreatePage {

    public static void createProfilePage(User u) throws IOException {
        PrintWriter pw = new PrintWriter("page.html");
        pw.println("<!DOCTYPE html>"
                + "<html>" +
                "<head>" +
                "<meta charset= UTF-8>" +
                "<title>SayHello</title>" +
                "</head>" + u.getName() +
                "<body>" +
                "</body>" +
                "</html>");
        pw.flush();
        pw.close();

    }

    public static void createFriendsPage(ArrayList<User> users) throws IOException {
        PrintWriter pw = new PrintWriter("friends.html");
        pw.println("<!DOCTYPE html>"
                + "<html>" +
                "<head>" +
                "<meta charset= UTF-8>" +
                "<title>SayHello</title>" +
                "</head>" +
                "<body>");
        for (User u : users) {
            pw.println(u.getName());
        }
        pw.println("</body>" +
                "</html>");
        pw.flush();
        pw.close();

    }

    public static void createProfilePageWithFriends(User u, ArrayList<User> users) throws IOException {
        PrintWriter pw = new PrintWriter("userAndFriends.html");
        pw.println("<!DOCTYPE html>"
                + "<html>" +
                "<head>" +
                "<meta charset= UTF-8>" +
                "<title>SayHello</title>" +
                "</head>" +
                "<body>");
        for (User user : users) {
            pw.println(user.getName());
        }
        pw.println(u.getName() + "</body>" +
                "</html>");
        pw.flush();
        pw.close();

    }



    public static void createPageOfReceiver(ArrayList<Message> messages) throws IOException {

            PrintWriter pw = new PrintWriter("receiver.html");

        pw.println("<!DOCTYPE html>"
                + "<html>" +
                "<head>" +
                "<meta charset= UTF-8>" +
                "<title>SayHello</title>" +
                "</head>" +
                "<body>");
        for (Message m : messages) {
            pw.println(m.getText());
        }
        pw.println("</body>" +
                "</html>");
        pw.flush();
        pw.close();
    }

    public static void createPageOfSender(ArrayList<Message> messages) throws IOException {

        PrintWriter pw = new PrintWriter("sender.html");

        pw.println("<!DOCTYPE html>"
                + "<html>" +
                "<head>" +
                "<meta charset= UTF-8>" +
                "<title>SayHello</title>" +
                "</head>" +
                "<body>");
        for (Message m : messages) {
            pw.println(m.getText());
        }
        pw.println("</body>" +
                "</html>");
        pw.flush();
        pw.close();
    }

    public static void createPageMessages(ArrayList<Message> messages) throws IOException {

        PrintWriter pw = new PrintWriter("message.html");

        pw.println("<!DOCTYPE html>"
                + "<html>" +
                "<head>" +
                "<meta charset= UTF-8>" +
                "<title>SayHello</title>" +
                "</head>" +
                "<body>");
        for (Message m : messages) {
            pw.println(m.getText());
        }
        pw.println("</body>" +
                "</html>");
        pw.flush();
        pw.close();
    }


}

