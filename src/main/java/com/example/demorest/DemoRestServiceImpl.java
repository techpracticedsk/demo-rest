package com.example.demorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


public class DemoRestServiceImpl implements DemoRestService {

    @Autowired
    UserRepository userRepoInterface;

    @GetMapping("/allusers")
    public List<UserDTO> getAllUser() {
        UserDTO utd = new UserDTO();
        userRepoInterface.findAll().stream().forEach(user -> {

        });
        //How to return List - discuss with Durga

        return null;

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
