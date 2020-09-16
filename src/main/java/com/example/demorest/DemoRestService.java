package com.example.demorest;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DemoRestService{

    public List<UserDTO> getAllUser();

    public void addUser();
}
