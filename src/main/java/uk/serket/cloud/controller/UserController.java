package uk.serket.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by daijin on 17/05/2015.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/r1")
    public String requestParm(String name, @RequestParam("password") String pwd) {
        System.out.println(name);
        System.out.println(pwd);
        return "index";
    }

}
