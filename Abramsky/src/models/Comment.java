package models;

public class Comment {

    int id_author;
    String name_author;
    int id_title;
    String text;
    String photo_author;

    public Comment() {
    }

    public Comment(int id_author, String name_author, int id_title, String text, String photo_author) {
        this.id_author = id_author;
        this.name_author = name_author;
        this.id_title = id_title;
        this.text = text;
        this.photo_author = photo_author;
    }

    public int getId_author() {
        return id_author;
    }

    public void setId_author(int id_author) {
        this.id_author = id_author;
    }

    public String getName_author() {
        return name_author;
    }

    public void setName_author(String name_author) {
        this.name_author = name_author;
    }

    public int getId_title() {
        return id_title;
    }

    public void setId_title(int id_title) {
        this.id_title = id_title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPhoto_author() {
        return photo_author;
    }

    public void setPhoto_author(String photo_author) {
        this.photo_author = photo_author;
    }
}