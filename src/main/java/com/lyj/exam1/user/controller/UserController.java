package com.lyj.exam1.user.controller;

import com.lyj.exam1.user.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/users") // 브라우저의 요청
public class UserController {
    @RequestMapping("")
    @ResponseBody
    public String users(){
        return "users :-)";
    }

    @RequestMapping("1")
    @ResponseBody
    public User user(){
        User user = new User();
        return user;
    }
}
