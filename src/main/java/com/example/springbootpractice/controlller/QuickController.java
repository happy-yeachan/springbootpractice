package com.example.springbootpractice.controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickController {
    @GetMapping("/test")
    public String test(){
        return "tessssssst";
    }
}
