package it.ErdisonDosti.service;



import it.ErdisonDosti.converter.RegisterUserConverter;
import it.ErdisonDosti.dao.RegisterUserRepository;
import it.ErdisonDosti.dto.RegisterUserDto;
import it.ErdisonDosti.entity.RegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;


@Service
public class RegisterUserService {

       @Autowired
       private RegisterUserRepository repository;

       @Autowired
       private RegisterUserConverter converter;


    public Iterable<RegisterUserDto> getAll() {

        return converter.toDTOList(repository.findAll());

    }

    public RegisterUserDto getRegisterUserById(Integer id) {
        Optional<RegisterUser> response=repository.findById(id);
        if (!response.isPresent()){
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND);
        }else {
            return converter.toDTOAndOrders(response.get());
        }
    }
}
