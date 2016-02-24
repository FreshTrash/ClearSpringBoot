package home.clear.controller;

import home.clear.model.User;
import home.clear.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by karimov on 24.02.2016.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll() {
        User user = new User();
        user.setFirstName("Name");
        user.setLastName("LastName");
        user.setBirthDay(LocalDate.now());
        userRepo.save(user);

        return userRepo.findAll();
    }
}
