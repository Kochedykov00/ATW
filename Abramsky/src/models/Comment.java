package models;

public class Comment {

    int id_author;
    String name_author;
    int id_discussion;
    int id_article;
    String text;

    public Comment() {
    }

    public Comment(int id_author, String name_author, int id_discussion, int id_article, String text) {
        this.id_author = id_author;
        this.name_author = name_author;
        this.id_discussion = id_discussion;
        this.id_article = id_article;
        this.text = text;
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

    public int getId_discussion() {
        return id_discussion;
    }

    public void setId_discussion(int id_discussion) {
        this.id_discussion = id_discussion;
    }

    public int getId_article() {
        return id_article;
    }

    public void setId_article(int id_article) {
        this.id_article = id_article;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}