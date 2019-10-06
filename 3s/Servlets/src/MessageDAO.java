import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

    public class MessageDAO {

        static ArrayList<Message> messages = new ArrayList<>();


        public static ArrayList<Message> getReceiverById(String id) throws IOException {

            ArrayList<Message> messagesOfReceiver = new ArrayList<>();


            messages.add(new Message("1","2","hello,world","30.09.2019"));
            messages.add(new Message("1","5","check my work out","30.09.2019"));
            messages.add(new Message("3","4","all-in","30.09.2019"));


            for (Message m : messages) {
                if (m.getIdOfReceiver().equals(id)) {
                    messagesOfReceiver.add(m);
                }
            }

            return messagesOfReceiver;
        }

        public static ArrayList<Message> getSenderById(String id) throws IOException {


            ArrayList<Message> messagesOfSender = new ArrayList<>();


            messages.add(new Message("1","2","hello,world","30.09.2019"));
            messages.add(new Message("1","5","check my work out","30.09.2019"));
            messages.add(new Message("3","4","all-in","30.09.2019"));


            for (Message m : messages) {
                if (m.getIdOfSender().equals(id)) {
                    messagesOfSender.add(m);
                }
            }

            return messagesOfSender;
        }

        public static ArrayList<Message> getMessagesById(String id1, String id2) throws IOException {


            ArrayList<Message> messagesOfSender = new ArrayList<>();


            messages.add(new Message("1","2","hello,world","30.09.2019"));
            messages.add(new Message("1","5","check my work out","30.09.2019"));
            messages.add(new Message("3","4","all-in","30.09.2019"));


            for (Message m : messages) {
                if (m.getIdOfSender().equals(id1) && m.getIdOfReceiver().equals(id2)) {
                    messagesOfSender.add(m);
                }
            }

            return messagesOfSender;
        }
    }

