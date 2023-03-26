//package com.springboot.api.controller;
//
//import com.springboot.api.model.User;
//import com.springboot.api.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/users")
//    public ResponseEntity<List<User>> findAll() {
//        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<User>> findById(@PathVariable Long id) {
//        return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id));
//    }
//
//    @PostMapping
//    public ResponseEntity<User> create(@RequestBody User user) {
//        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<User> update(@RequestBody User user) {
//        return ResponseEntity.status(HttpStatus.OK).body(userService.update(user));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable Long id) {
//        userService.deleteById(id);
//        return ResponseEntity.status(HttpStatus.OK).build();
//    }
//
//}
