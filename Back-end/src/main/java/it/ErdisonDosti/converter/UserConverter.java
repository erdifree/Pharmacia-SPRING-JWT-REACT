package it.ErdisonDosti.converter;

import it.ErdisonDosti.Token.Token;
import it.ErdisonDosti.Token.TokenRepository;
import it.ErdisonDosti.dto.UserDTO;
import it.ErdisonDosti.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.function.Function;


@Component
public class UserConverter extends AbstractConverter<User, UserDTO> {

 @Autowired
  private  PasswordEncoder passwordEncoder;

 @Autowired
 private PharmaciaConverter pharmaciaConverter;

 @Autowired
 private TokenRepository repository;
    @Override
    public User toEntity(UserDTO userDTO) {
        User user=null;
        if(userDTO !=null){
            user=User
                    .builder()
                    .id(userDTO.getId())
                    .email(userDTO.getEmail())
                    .password(userDTO.getPassword())
                    .role(userDTO.getRole())
                    .registeruser(userDTO.getRegisteruser())
                    .pharmacia(userDTO.getPharmacy())
                    .build();
        }
        return user;
    }

    @Override
    public UserDTO toDTO(User user) {
        UserDTO userDTO=null;
        if(user !=null){
            userDTO=UserDTO
                    .builder()
                    .id(user.getId())
                    .email(user.getEmail())
                    .password(user.getPassword())
                    .role(user.getRole())
                    .registeruser(user.getRegisteruser())
                    .pharmacy( pharmaciaConverter.toEntity(pharmaciaConverter.toDTO( user.getPharmacia())))
                    .build();
        }
        return userDTO;
    }
}
