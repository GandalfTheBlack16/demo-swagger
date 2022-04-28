package com.example.demoswagger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/api/demo")
    public DemoBean retrieveDemo(@RequestBody DemoBean input){
        return new DemoBean(input.getName(), input.getEmail(), input.getConfirmEmail());
    }
}
