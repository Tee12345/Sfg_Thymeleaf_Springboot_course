package com.babatunde.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String getIndex() {

        return "index";
    }
}
