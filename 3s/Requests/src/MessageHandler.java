import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class MessageHandler {

    public void service(Map<String, String> params,String path) throws IOException {

        if (path == "/im"){
        ArrayList<Message> m = MessageDAO.getReceiverById(params.get("id"));
        CreatePage.createPageOfReceiver(m);
    }
        else if (path == "/om") {
            ArrayList<Message> m = MessageDAO.getSenderById(params.get("id"));
            CreatePage.createPageOfSender(m);
        }
        else {
            ArrayList<Message> m = MessageDAO.getMessagesById(params.get("id1"),params.get("id2"));
            CreatePage.createPageMessages(m);
        }
    }
}
