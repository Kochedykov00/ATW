public class Message {

    String IdOfSender;
    String IdOfReceiver;
    String text;
    String date;

    public Message(String idOfSender, String idOfReceiver, String text, String date) {
        IdOfSender = idOfSender;
        IdOfReceiver = idOfReceiver;
        this.text = text;
        this.date = date;
    }

    public String getIdOfSender() {
        return IdOfSender;
    }

    public void setIdOfSender(String idOfSender) {
        IdOfSender = idOfSender;
    }

    public String getIdOfReceiver() {
        return IdOfReceiver;
    }

    public void setIdOfReceiver(String idOfReceiver) {
        IdOfReceiver = idOfReceiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
