package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/{viewName}")
    public String viewName(@PathVariable("viewName")String viewName){

        return viewName;
    }

}
