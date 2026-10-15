
package com.example.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/api/public")
    public String publicAccess() {
        return "Public Access Successful";
    }

    @GetMapping("/api/user")
    public String userAccess() {
        return "Welcome User";
    }

    @GetMapping("/api/admin")
    public String adminAccess() {
        return "Welcome Admin";
    }
}
