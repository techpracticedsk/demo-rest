package com.example.demorest;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO implements Serializable {
    Long userid;
    String email;
    String name;
    String city;

    @Override
    public String toString() {
        return "UserDTO{" +
                "userid=" + userid +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
