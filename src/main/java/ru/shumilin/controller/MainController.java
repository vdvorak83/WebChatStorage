package ru.shumilin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class MainController {

    @RequestMapping("/")
    public String mainPage(Map<String,Object>model){
        return "main";
    }

    @RequestMapping("/chat")
    public String chatPage(Map<String,Object>model){
        return "chatPage";
    }

//    @RequestMapping("/storage")
//    public String storagePage(Map<String,Object> model){
//        return "storagePage";
//    }
}
