package com.example.simpleroot.Controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "api/v1/user")
@CrossOrigin
@RestController
public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "get User";
    }

    @PostMapping("/postUser")
    public String postUser(){
        return "save user";
    }

    @PutMapping("/putUser")
    public String putUser(){
        return "update user";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "delete user";
    }
}
