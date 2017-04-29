package com.fiestel.controller;

import com.fiestel.domain.User;
import com.fiestel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/user/create")
    @ResponseBody
    public String create(String email, String name, String password) {
        String userId = "";
        try {
            User user = new User(email, name, password);
            userRepository.save(user);
            userId = String.valueOf(user.getId());
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created with id = " + userId;
    }

    

}
