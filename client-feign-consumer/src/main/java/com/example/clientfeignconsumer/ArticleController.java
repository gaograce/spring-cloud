package com.example.clientfeignconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
    @Autowired
    private UserRemoteClient userRemoteClient;

    @GetMapping("/article/callHello")
    public String callHello() {
        return userRemoteClient.hello();
    }
}
