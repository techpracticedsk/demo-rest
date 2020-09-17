package com.example.demorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoRestServiceImpl implements DemoRestService {

    @Autowired
    UserRepository userRepoInterface;


    public List<UserDTO> getAllUser() {

        List<UserDTO> custList = new ArrayList<UserDTO>();
        userRepoInterface.findAll().stream().forEach(user -> {
            UserDTO utd = new UserDTO();
            utd.setEmail(user.getEmail());
            utd.setUserid(user.getUserId());
            utd.setName(user.getFName());
            custList.add(utd);
        });

        return custList;

    }


    public void addUser(UserDTO utd) {

        System.out.println(" ---> "+utd.getName());
        User usr = new User();
        usr.setEmail(utd.getEmail());
        usr.setFName(utd.getName());
        usr.setCity(utd.getCity());
        userRepoInterface.save(usr);

    }

}
