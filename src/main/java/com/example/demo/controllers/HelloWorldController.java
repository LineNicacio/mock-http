package com.example.demo.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
@Tag(name = "Hello example", description = "Rest api hello world")
public class HelloWorldController {

    @GetMapping
    public ResponseEntity<String> getExample() {
        return ResponseEntity.ok("Hello");
    }

    @PostMapping("/{text}")
    public ResponseEntity<String> postExample(String text) {
        return ResponseEntity.ok(text);
    }
}
