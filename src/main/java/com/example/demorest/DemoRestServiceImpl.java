package com.example.demorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


public class DemoRestServiceImpl implements DemoRestService {

    @Autowired
    UserRepository userRepoInterface;

    @GetMapping("/allusers")
    public void getAllUser() {
        userRepoInterface.findAll();
        //How to return - discuss with Durga
    }

    @RequestMapping("/add/user")
    public void addUser() {
        User usr= new User();
        usr.setFName("test-user1");
        usr.setEmail("test@email.com");
        usr.setCity("Bangalore");
        userRepoInterface.save(usr);
        //Discuss with Durga
    }

}
