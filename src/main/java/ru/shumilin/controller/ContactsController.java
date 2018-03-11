package ru.shumilin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactsController {
    @RequestMapping("/about")
    public String aboutPage(){
        return "about";
    }
}
