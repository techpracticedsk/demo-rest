package com.example.demorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo/user/v1/api/")
public class DemoRestController {

    ///// How to make the call from controller.
    ///// Discuss with Durga

    @Autowired
    DemoRestService demoRestService;

    @GetMapping("/allusers")
    public void getAllUser(){
        demoRestService.getAllUser();
    }


    @RequestMapping("/add/user")
    @PostMapping
    public void addUserToDB(@RequestBody UserDTO userDTO){

        demoRestService.addUser(userDTO);
    }
}
