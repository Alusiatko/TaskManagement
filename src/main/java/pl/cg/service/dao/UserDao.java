package pl.cg.service.dao;

import pl.cg.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    void addUser(User user);
}
