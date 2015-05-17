package uk.serket.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by daijin on 17/05/2015.
 */

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping("/hello")
    public ModelAndView hello() {
        ModelAndView m = new ModelAndView();
        m.addObject("name", "Tome");
        m.setViewName("index");
        return m;
    }
}
