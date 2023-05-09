package it.ErdisonDosti.controller;


import it.ErdisonDosti.converter.RegisterUserConverter;
import it.ErdisonDosti.dao.RegisterUserRepository;
import it.ErdisonDosti.dto.RegisterUserDto;
import it.ErdisonDosti.entity.RegisterUser;
import it.ErdisonDosti.service.AbstractService;
import it.ErdisonDosti.service.RegisterUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/registeruser")
@RequiredArgsConstructor
@PreAuthorize("hasRole('ADMIN')")
public class RegisterUserControll {

private final RegisterUserService service;


    @GetMapping

    public Iterable<RegisterUserDto> getAll() {
        return service.getAll();
    }
}
