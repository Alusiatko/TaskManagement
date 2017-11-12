package pl.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.cg.model.User;
import pl.cg.service.dao.UserDao;

import java.util.List;

@Service
public class UsersServiceImplementation implements UsersService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public void addUser(User user) {

    }
}
