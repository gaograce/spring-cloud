package com.example.clientuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    Environment environment;

    @GetMapping("/user/hello")
    public String hello() {
        return "hello, " + environment.getProperty("local.server.port");
    }

    @GetMapping
    public String main() {
        return "Hello, I am a Client";
    }
}
