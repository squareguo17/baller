package com.balldance.baller.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class User {
    @ResponseBody
    @RequestMapping("/getUserInfo")
    public String getUserInfo(@RequestParam String userId) {
        return userId;
    }
}
