package com.example.demorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/user/v1/api/")
public class DemoRestController {

    ///// How to make the call from controller.
    ///// Discuss with Durga

    @Autowired
    DemoRestService demoRestService;

    @GetMapping("/allusers")
    public void getAllUser(){
        demoRestService.addUser();
    }


    @RequestMapping("/add/user")
    public void addUserToDB(){
        demoRestService.addUser();
    }
}
