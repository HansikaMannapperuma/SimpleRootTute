package com.example.simpleroot.Controller;

import com.example.simpleroot.DTO.UserDTO;
import com.example.simpleroot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "api/v1/user")
@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getUser")
    public List<UserDTO> getUser(){
        return userService.getAllUsers();
    }

    @PostMapping("/postUser")
    public UserDTO postUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/putUser")
    public UserDTO putUser(UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }

    @GetMapping("/getUserByUserId/{userId}")
    public UserDTO getUserByUserId(@PathVariable String userId){
        return userService.getUserByUserId(userId);
    }

    @GetMapping("/getUserByUserIdAndAddress/{userId}/{address}")
    public UserDTO getUserByUserIdAndAddress(@PathVariable String userId,@PathVariable String address){
        return userService.getUserByUserIdAndAddress(userId,address);
    }
}
