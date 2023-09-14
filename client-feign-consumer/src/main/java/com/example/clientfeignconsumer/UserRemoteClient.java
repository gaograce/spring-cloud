package com.example.clientfeignconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client-user-service", configuration = FeignCOnfiguration.class)
public interface UserRemoteClient {
    @GetMapping("/user/hello")
    String hello();
}
