package com.hosted.selfhosted;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SelfController {

    @GetMapping("/")
    public String hi(){
        return "hi";
    }
}
