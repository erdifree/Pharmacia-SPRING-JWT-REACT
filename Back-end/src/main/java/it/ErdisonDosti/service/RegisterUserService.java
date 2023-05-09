package it.ErdisonDosti.service;



import it.ErdisonDosti.converter.RegisterUserConverter;
import it.ErdisonDosti.dao.RegisterUserRepository;
import it.ErdisonDosti.dto.RegisterUserDto;
import it.ErdisonDosti.entity.RegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;


@Service
public class RegisterUserService {

@Autowired
private RegisterUserRepository repository;

@Autowired
    RegisterUserConverter converter;

    @PreAuthorize("hasAuthority('admin:read')")
    public Iterable<RegisterUserDto> getAll() {

        return converter.toDTOList(repository.findAll());

    }
}
