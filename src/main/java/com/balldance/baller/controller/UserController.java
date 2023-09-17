package com.balldance.baller.controller;

import com.balldance.baller.model.Test;
import com.balldance.baller.model.User;
import com.balldance.baller.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    // Autowired注解会自动将userRepository和对应的数据表进行绑定, 不需要额外初始化
    @Autowired
    private UserRepository mUserRepository;

    /**
     * 更新用户信息的http api接口.
     * 这里的user是通过requestBody的json自动映射到了User对象里面
     *
     * @param user
     * @return
     */
    @ResponseBody
    @PostMapping("/updateUser")
    public int update(@RequestBody User user) {
        System.out.println("getUserInfo");
        User res = mUserRepository.save(user);
        return 0;
    }
}
