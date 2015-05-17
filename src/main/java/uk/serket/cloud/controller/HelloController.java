package uk.serket.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by daijin on 17/05/2015.
 */

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "index";
    }
}
