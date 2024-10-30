package com.javaproject.customer.springcloud.client.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaproject.customer.springcloud.client.service.AuthenticationService;

@RequestMapping("/auth/v1")
@RestController
public class AuthController {

    private AuthenticationService authenticationService;

    public AuthController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping("/token/{username}")
    public ResponseEntity<String> login(@PathVariable String username) {
        return ResponseEntity.ok().body(this.authenticationService.generateToken(username));
    }

    @GetMapping("/username")
    public ResponseEntity<String> getUsername(@RequestHeader(value = "Authorization") String token) {
        return ResponseEntity.ok().body(this.authenticationService.getUsername(token));
    }

    @GetMapping("/is-authenticated")
    public ResponseEntity<Boolean> isAuthenticated(@RequestHeader(value = "Authorization") String token) {
        return ResponseEntity.ok().body(this.authenticationService.isValid(token));
    }
}