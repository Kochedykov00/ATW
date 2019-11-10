package dao;

import models.Comment;

import java.util.List;

public interface CommentDAO {

    public List<Comment> listOfComment (int id_title);
}
