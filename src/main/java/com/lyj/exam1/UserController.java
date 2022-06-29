package com.lyj.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api") // 브라우저의 요청
public class UserController {
    @RequestMapping("/users")
    @ResponseBody
    public String users(){
        return "users :)";
    }

    @RequestMapping("1")
    @ResponseBody
    public String user(){
        return "user :)";
    }
}
