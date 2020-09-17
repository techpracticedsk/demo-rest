package com.example.demorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo/user/v1/api/")
public class DemoRestController {


    @Autowired
    DemoRestService demoRestService;

    @GetMapping("/allusers")
    public List<UserDTO> getAllUser(){
       return demoRestService.getAllUser();
    }


    @RequestMapping("/add/user")
    @PostMapping
    public ResponseEntity<UserDTO> addUserToDB(@RequestBody UserDTO userDTO){

        demoRestService.addUser(userDTO);
        return new ResponseEntity<UserDTO>(userDTO, HttpStatus.OK);
    }


}
