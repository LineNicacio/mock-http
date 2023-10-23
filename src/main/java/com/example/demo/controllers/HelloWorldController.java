package com.example.demo.controllers;

import com.example.demo.domain.Hello;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
@Tag(name = "Hello example", description = "Rest api hello world")
public class HelloWorldController {

    @GetMapping("/{name}")
    public ResponseEntity<String> getExample(@PathVariable String name) {
        return ResponseEntity.ok("Hello "+ name);
    }

    @PostMapping
    public ResponseEntity<Hello> postExample(@RequestBody Hello hello) {
        return ResponseEntity.ok().body(hello);
    }
}
