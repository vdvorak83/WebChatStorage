package ru.shumilin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ChatController {
    @RequestMapping("/chat")
    public String chatPage(Map<String,Object> model){
        return "chatPage";
    }
}
