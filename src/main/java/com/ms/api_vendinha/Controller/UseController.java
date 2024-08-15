package com.ms.api_vendinha.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UseController {

    @PostMapping("/user")
    public String save(){
        return "user save";

    }

}
