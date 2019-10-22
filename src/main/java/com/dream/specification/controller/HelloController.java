package com.dream.specification.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
public class HelloController {

    private static Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("name", "thymeleaf");
        log.info("访问hello接口");
        return "hello";
    }
}
