package com.example.yumyelpv1.controllers;

import com.example.yumyelpv1.domain.users.RequestUser;
import com.example.yumyelpv1.domain.users.User;
import com.example.yumyelpv1.domain.users.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UsersRepository repository;
    @GetMapping
    public ResponseEntity getUser(){
        var alluser = repository.findAll();
        return ResponseEntity.ok(alluser);
    }
    @PostMapping
    public ResponseEntity RegisterUser (@RequestBody @Valid RequestUser data) {
        System.out.println(data);
        User user = new User(data);
        repository.save(user);
        return ResponseEntity.ok("usuário cadastrado com sucesso");
    }
}
