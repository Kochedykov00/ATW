package models;

public class Blog {

    int id_author;
    int id_blog;
    String name;
    String description;

    public Blog(int id_author, int id_blog, String name, String description) {
        this.id_author = id_author;
        this.id_blog = id_blog;
        this.name = name;
        this.description = description;
    }


    public Blog() {
    }

    public int getId_author() {
        return id_author;
    }

    public void setId_author(int id_author) {
        this.id_author = id_author;
    }

    public int getId_blog() {
        return id_blog;
    }

    public void setId_blog(int id_blog) {
        this.id_blog = id_blog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}