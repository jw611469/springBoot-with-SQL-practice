package com.example.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

@Controller
public class testController {

    @GetMapping("/index")
    public String test(){
        return "index";
    } 
}
