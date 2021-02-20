package com.lyoko.result.controller;

import com.lyoko.result.annotation.CosmoController;
import com.lyoko.result.annotation.IgnoreCosmoResult;
import com.lyoko.result.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Slf4j
@CosmoController
public class DemoResultController {

    @GetMapping("/user/{d}")
    public User getUser(@PathVariable int d) {
        User user = new User();
        user.setAge(d);
        return user;
    }
    @IgnoreCosmoResult
    @GetMapping("/user2/{d}")
    public User getUser2(@PathVariable int d) {
        User user = new User();
        user.setAge(d);
        return user;
    }


}
