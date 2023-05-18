package it.ErdisonDosti.controller;


import it.ErdisonDosti.converter.RegisterUserConverter;
import it.ErdisonDosti.dao.RegisterUserRepository;
import it.ErdisonDosti.dto.RegisterUserDto;
import it.ErdisonDosti.entity.RegisterUser;
import it.ErdisonDosti.service.AbstractService;
import it.ErdisonDosti.service.RegisterUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin/registeruser")
@CrossOrigin
public class RegisterUserControll {

    @Autowired
     private RegisterUserService service;


    @GetMapping
    public Iterable<RegisterUserDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public RegisterUserDto getRegisterUserById(@PathVariable Integer id){
        return service.getRegisterUserById(id);
    }
}
