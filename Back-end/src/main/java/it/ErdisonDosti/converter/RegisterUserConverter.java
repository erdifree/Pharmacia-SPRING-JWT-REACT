package it.ErdisonDosti.converter;

import it.ErdisonDosti.dto.RegisterUserDto;
import it.ErdisonDosti.entity.RegisterUser;
import org.springframework.stereotype.Component;


@Component
public class RegisterUserConverter extends AbstractConverter<RegisterUser,RegisterUserDto>{

    @Override
    public RegisterUser toEntity(RegisterUserDto registerUserDto) {
        RegisterUser registerUser=null;
        if (registerUserDto == null) {
            throw  new RuntimeException("No RegisterUserDTO find");
        }else {
            registerUser=RegisterUser
                    .builder()
                    .id(registerUserDto.getId())
                    .name(registerUserDto.getName())
                    .lastname(registerUserDto.getLastname())
                    .dob(registerUserDto.getDob())
                    .city(registerUserDto.getCity())
                    .country(registerUserDto.getCountry())
                    .address(registerUserDto.getAddress())
                    .zipCode(registerUserDto.getZipCode())

                    .build();
        }
        return registerUser;
    }

    @Override
    public RegisterUserDto toDTO(RegisterUser registerUser) {
        RegisterUserDto registerUserDto=null;
        if (registerUser == null) {
            throw  new RuntimeException("No RegisterUserDTO find");
        }else {
            registerUserDto=RegisterUserDto
                    .builder()
                    .id(registerUser.getId())
                    .name(registerUser.getName())
                    .lastname(registerUser.getLastname())
                    .dob(registerUser.getDob())
                    .city(registerUser.getCity())
                    .country(registerUser.getCountry())
                    .address(registerUser.getAddress())
                    .zipCode(registerUser.getZipCode())

                    .build();
        }
        return registerUserDto;
    }



    public RegisterUserDto toDTOAndOrders(RegisterUser registerUser) {
        RegisterUserDto registerUserDto=null;
        if (registerUser == null) {
            throw  new RuntimeException("No RegisterUserDTO find");
        }else {
            registerUserDto=RegisterUserDto
                    .builder()
                    .id(registerUser.getId())
                    .name(registerUser.getName())
                    .lastname(registerUser.getLastname())
                    .dob(registerUser.getDob())
                    .city(registerUser.getCity())
                    .country(registerUser.getCountry())
                    .address(registerUser.getAddress())
                    .zipCode(registerUser.getZipCode())

                    .build();
        }
        return registerUserDto;
    }



}
