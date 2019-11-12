package dao;

import models.Comment;

import java.util.List;

public interface CommentDAO {

    public List<Comment> listOfCommentByDiscussion (int id_discussion);
    public List<Comment> listOfCommentByArticle (int id_article);
    public int addComment(Comment comment);
    public int addCommentByDiscussion (Comment comment);
}
