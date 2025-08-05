package com.priyanka.webgen.controller;

import com.priyanka.webgen.dto.LoginRequest;
import com.priyanka.webgen.dto.SignupRequest;
import com.priyanka.webgen.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5500") // Use your frontend's URL
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    // Login endpoint
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        String message = authService.authenticateUser(loginRequest);
        return ResponseEntity.ok(message);
    }

    // Signup endpoint
    @PostMapping("/signup")
    public ResponseEntity<String> registerUser(@RequestBody SignupRequest signupRequest) {
        authService.registerUser(signupRequest);
        return ResponseEntity.ok("User registered successfully!");
    }
}

    
