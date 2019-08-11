package com.dream.specification.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("name", "thymeleaf");
        System.out.println("访问hello.html");
        return "hello";
    }
}
