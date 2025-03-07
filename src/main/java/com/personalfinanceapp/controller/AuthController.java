package com.personalfinanceapp.controller;
import com.personalfinanceapp.dto.RegisterRequest;
import com.personalfinanceapp.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/register")
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*", allowCredentials = "true")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping
    public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
        String message = authService.registerUser(request);
        if (message.equals("User registered successfully!")) {
            return ResponseEntity.ok(message);
        }
        return ResponseEntity.badRequest().body(message);
    }
}

