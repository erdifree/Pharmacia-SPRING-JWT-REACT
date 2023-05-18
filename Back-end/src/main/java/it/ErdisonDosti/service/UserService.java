package it.ErdisonDosti.service;


import it.ErdisonDosti.converter.RegisterUserConverter;
import it.ErdisonDosti.converter.UserConverter;
import it.ErdisonDosti.dao.RegisterUserRepository;
import it.ErdisonDosti.dao.UserRepository;
import it.ErdisonDosti.dto.RegisterUserDto;
import it.ErdisonDosti.dto.UserDTO;
import it.ErdisonDosti.entity.User;
import it.ErdisonDosti.exeption.ApiExeceptionHandler;
import it.ErdisonDosti.exeption.ApiRequestExeption;
import it.ErdisonDosti.exeption.ExceptionErrorEnum;
import jakarta.persistence.Enumerated;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService extends  AbstractService<User, UserDTO> {

    @Autowired
    private UserRepository repository;
    @Autowired
    UserConverter converter;

    private final ApiExeceptionHandler apiExeceptionHandler;

    public ResponseEntity<Object> getUserAuthenticated() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.getPrincipal() instanceof UserDetails) {
            UserDetails userDetails = ((UserDetails) authentication.getPrincipal());
            Optional<User> response = repository.findByEmail(userDetails.getUsername());
            if (response.isEmpty()) {
                throw new ApiRequestExeption(ExceptionErrorEnum.PB_USER_NFE.getMessage());
            }
            return ResponseEntity.ok(converter.toDTO(response.get()));
        }
        return apiExeceptionHandler.handleApiRequestExeption(new ApiRequestExeption(ExceptionErrorEnum.GENNERIC_E.getMessage()));
    }
}