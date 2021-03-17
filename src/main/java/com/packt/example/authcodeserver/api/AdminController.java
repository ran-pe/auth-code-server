package com.packt.example.authcodeserver.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AdminController {

    @RequestMapping("/api/users")
    public ResponseEntity<List<AdminProfile>> getAllUsers() {
        return ResponseEntity.ok(getUsers());
    }

    private List<AdminProfile> getUsers() {
        List<AdminProfile> users = new ArrayList<>();
        users.add(new AdminProfile("youngran1", "youngran1@mailinator.com"));
        users.add(new AdminProfile("youngran2", "youngran2@mailinator.com"));
        users.add(new AdminProfile("youngran3", "youngran3@mailinator.com"));
        return users;
    }
}
