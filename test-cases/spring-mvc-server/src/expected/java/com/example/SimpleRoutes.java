package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface SimpleRoutes {

    @PostMapping(path = "/", produces = "application/json", consumes = "application/json")
    ResponseEntity<String> create(@RequestBody com.example.Item item);

    @GetMapping(path = "/{id}", produces = "application/json")
    ResponseEntity<com.example.Item> get(@PathVariable("id") String id);

}
