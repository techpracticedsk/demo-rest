package com.example.demorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class DemoRestServiceImpl implements DemoRestService {

    @Autowired
    UserRepository userRepoInterface;

    @GetMapping("/allusers")
    public void getAllUser() {
        System.out.println("I m inside...get all users...");
        Iterable itr = userRepoInterface.findAll();
    }
}
