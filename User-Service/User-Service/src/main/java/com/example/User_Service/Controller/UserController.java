package com.example.User_Service.Controller;

import com.example.User_Service.Service.UserService;
import com.example.User_Service.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@RefreshScope
public class UserController {

    @Autowired
    private UserService userService;

//    @Value("${my.message}")
//    private String message;
//
//    @GetMapping("/message")
//    public String getMessage() {
//        return message;
//    }
    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }


}
