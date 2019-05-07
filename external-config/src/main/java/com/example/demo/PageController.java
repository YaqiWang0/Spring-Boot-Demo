package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PageController {

    @Value(("${pageController.msg}"))
    private String pageControllerMsg;

    @Value("${app.description}")
    private String mySecret;
    @RequestMapping("/")

    public String page(){
        return mySecret;
    }

}
