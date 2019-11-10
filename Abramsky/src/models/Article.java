package models;

import javafx.scene.text.Text;

public class Article {


    int user_id;
    int title_id;
    String author;
    String title;
    String text;
    String date;
    int rating;
    String photoPath;


    public Article() {
    }

    public Article(int user_id, int title_id, String author, String title, String text, String date, int rating, String photoPath) {
        this.user_id = user_id;
        this.title_id = title_id;
        this.author = author;
        this.title = title;
        this.text = text;
        this.date = date;
        this.rating = rating;
        this.photoPath = photoPath;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getTitle_id() {
        return title_id;
    }

    public void setTitle_id(int title_id) {
        this.title_id = title_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
}
