package it.ErdisonDosti.controller;

import it.ErdisonDosti.dto.RegisterUserDto;
import it.ErdisonDosti.dto.UserDTO;
import it.ErdisonDosti.service.RegisterUserService;
import it.ErdisonDosti.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/admin/user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<Object>  getUserAuthenticated() {
        return service.getUserAuthenticated();
    }
}
