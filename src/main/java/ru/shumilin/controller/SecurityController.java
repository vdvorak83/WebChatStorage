package ru.shumilin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.shumilin.usersAuthorisation.UsersAuthorisationService;

@Controller
public class SecurityController {
    @Autowired
    UsersAuthorisationService authorisationService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
