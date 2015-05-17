package uk.serket.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import uk.serket.cloud.bean.User;

/**
 * Created by daijin on 17/05/2015.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/r1")
    public String requestParm(User user) {
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        return "index";
    }

    @RequestMapping( value = "/r2/{userid}", method = RequestMethod.GET)
    public String requestParm3(@PathVariable("userid")String userid) {
        System.out.println(userid);
        return "index";
    }

    @RequestMapping("/r4")
    @ResponseBody
    public User getuser() {
        User user = new User();
        user.setName("Tome");
        user.setPassword("123123");
        return user;
    }

}
