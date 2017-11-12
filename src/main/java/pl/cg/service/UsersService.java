package pl.cg.service;

import org.springframework.stereotype.Service;
import pl.cg.model.User;

import java.util.List;

@Service
public interface UsersService {

    List<User> getUsers();

    void addUser(User user);
}
