package pl.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.cg.model.User;
import pl.cg.service.UsersService;

import java.util.List;

@RestController
@CrossOrigin
public class UsersController {

    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping("/users")
    public List<User> users() {
        return usersService.getUsers();
    }
}
