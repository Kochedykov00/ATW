package dao;

import models.User;

public interface UserDAO {

    public int insertUser(User u );
    public User getUser (String username, String password) ;
    public User getUserById(int id);

}
