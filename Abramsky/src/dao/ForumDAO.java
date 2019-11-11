package dao;

import models.Forum;
import models.Forums;

import java.util.List;

public interface ForumDAO {

    public int insertDiscussion(Forum forum);
    public List<Forums> getAll ();
    public Forums getForumById(int id);
}
