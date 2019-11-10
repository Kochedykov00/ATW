package models;

import java.util.Date;

public class Forum {

    int id;
    int id_author;
    String author;
    String name;
    String text;
    Date date;

    public Forum() {
    }

    public Forum(int id, int id_author, String author, String name, String text, Date date) {
        this.id = id;
        this.id_author = id_author;
        this.author = author;
        this.name = name;
        this.text = text;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_author() {
        return id_author;
    }

    public void setId_author(int id_author) {
        this.id_author = id_author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
