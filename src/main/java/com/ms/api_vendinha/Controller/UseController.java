package com.ms.api_vendinha.Controller;

import com.ms.api_vendinha.domain.dto.UserRequestDto;
import com.ms.api_vendinha.domain.dto.UserResponseDto;
import com.ms.api_vendinha.domain.services.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UseController {

    @Autowired
    public UserServiceInterface userServiceInterface;

    @PostMapping("/user")
    public String save(){
        return "user save";

    }

    @PostMapping("/usuario")
    public UserResponseDto save(@RequestBody UserRequestDto userRequestDto){
        return this.userServiceInterface.save(userRequestDto);
    }
}
