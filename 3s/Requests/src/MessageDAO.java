import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MessageDAO {

    static ArrayList<Message> messages = new ArrayList<>();


    public static ArrayList<Message> getReceiverById(String id) throws IOException {

        Scanner sc = new Scanner(new File("message.txt"));
        ArrayList<Message> messagesOfReceiver = new ArrayList<>();


        while (sc.hasNextLine()) {
            String[] data = sc.nextLine().split("-");
            messages.add(new Message(data[0], data[1], data[2], data[3]));
        }

        for (Message m : messages) {
            if (m.getIdOfReceiver().equals(id)) {
                messagesOfReceiver.add(m);
            }
        }

        return messagesOfReceiver;
    }

    public static ArrayList<Message> getSenderById(String id) throws IOException {

        Scanner sc = new Scanner(new File("message.txt"));
        ArrayList<Message> messagesOfSender = new ArrayList<>();


        while (sc.hasNextLine()) {
            String[] data = sc.nextLine().split("-");
            messages.add(new Message(data[0], data[1], data[2], data[3]));
        }

        for (Message m : messages) {
            if (m.getIdOfSender().equals(id)) {
                messagesOfSender.add(m);
            }
        }

        return messagesOfSender;
    }

    public static ArrayList<Message> getMessagesById(String id1, String id2) throws IOException {

        Scanner sc = new Scanner(new File("message.txt"));
        ArrayList<Message> messagesOfSender = new ArrayList<>();


        while (sc.hasNextLine()) {
            String[] data = sc.nextLine().split("-");
            messages.add(new Message(data[0], data[1], data[2], data[3]));
        }

        for (Message m : messages) {
            if (m.getIdOfSender().equals(id1) && m.getIdOfReceiver().equals(id2)) {
                messagesOfSender.add(m);
            }
        }

        return messagesOfSender;
    }
}