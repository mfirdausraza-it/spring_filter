package com.custom.servalet_filter.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MessageController {

    @GetMapping(value = "msg/greet")
    public ResponseEntity<?> greet(){
        log.info("{}, Welcome to {} ", "John","SharkTank");
        return ResponseEntity.ok(String.format("%s, Welcome to %s ", "John", "SharkTank"));
    }

    @GetMapping(value = "msg/home")
    public ResponseEntity<?> home(){
        log.info("{}, Welcome to {} ", "John","SharkTank");
        return ResponseEntity.ok(String.format("%s, Welcome to %s ", "John", "SharkTank"));
    }

    @GetMapping(value = "users/name")
    public ResponseEntity<?> getName(){
        log.info("My name is {}", "john");
        return ResponseEntity.ok(String.format("My name is %s", "john"));
    }

    @GetMapping(value = "login/home/{name}")
    public ResponseEntity<?> login(@PathVariable(value = "name") String name){
        log.info("John, you login successfully");
        return ResponseEntity.ok(name + " , you logged in successfully");
    }
}
