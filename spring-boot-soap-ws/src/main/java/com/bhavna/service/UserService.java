package com.bhavna.service;

import org.springframework.stereotype.Service;

import com.bhavna.springbootsoap.User;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {

        User peter = new User();
        peter.setName("Rajinikanth");
        peter.setEmpId(450);
        peter.setSalary(25000);

        User sam = new User();
        sam.setName("Srikanth");
        sam.setEmpId(426);
        sam.setSalary(32000);
        User ryan = new User();
        ryan.setName("Sathish");
        ryan.setEmpId(520);
        ryan.setSalary(16000);

        users.put(peter.getName(), peter);
        users.put(sam.getName(), sam);
        users.put(ryan.getName(), ryan);
    }


    public User getUsers(String name) {
        return users.get(name);
    }
}
