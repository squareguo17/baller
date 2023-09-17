package com.balldance.baller.controller;

import com.balldance.baller.model.User;
import com.balldance.baller.repository.UserRepository;
import com.balldance.baller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserRepository mUserRepository;

    @ResponseBody
    @RequestMapping("/getUserInfo")
    public String getUserInfo(@RequestParam String userId) {
        System.out.println("getUserInfo");
        User user = new User();
        mUserRepository.save(user);
        return userId;
    }
}
