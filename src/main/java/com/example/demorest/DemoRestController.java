package com.example.demorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/user/v1/api/")
public class DemoRestController {

  /*  //@GetMapping("/name")
    @RequestMapping("/uname")
    public String getName(){
        return "Subhasis Roy";
    }*/

   // demoRestService.getAllUser();

    @Autowired
    DemoRestService demoRestService;

}