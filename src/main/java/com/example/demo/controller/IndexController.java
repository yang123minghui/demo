package com.example.demo.controller;

import org.springframework.boot.logging.LogFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class IndexController {
    @RequestMapping("/{viewName}")
    public String viewName(@PathVariable("viewName")String viewName){

        return viewName;
    }

}
