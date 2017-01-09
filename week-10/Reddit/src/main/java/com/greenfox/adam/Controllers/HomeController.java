package com.greenfox.adam.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Verőci Ádám on 2017.01.08..
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method= RequestMethod.GET)
    public String hello(){
        return "redirect:/posts";
    }
}
