package com.example.authorizationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class AuthorizationserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthorizationserverApplication.class, args);
    }

}
