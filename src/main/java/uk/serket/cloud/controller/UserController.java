package uk.serket.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by daijin on 17/05/2015.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/*/createUser")
    public String createUser() {
        System.out.println("/user/*/createUser");
        return "index";
    }

    @RequestMapping("/**/createUser2")
    public String createUser2() {
        System.out.println("/user/**/createUser");
        return "index";
    }


}
