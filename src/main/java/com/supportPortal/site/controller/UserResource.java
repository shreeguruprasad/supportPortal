package com.supportPortal.site.controller;

import com.supportPortal.site.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping("/home")
    public Object showUser(){
        String st = new String("Applicationzzzzzzzzzzzzz");
        return st;
    }
}
