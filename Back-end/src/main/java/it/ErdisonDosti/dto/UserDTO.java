package it.ErdisonDosti.dto;


import it.ErdisonDosti.entity.RegisterUser;
import it.ErdisonDosti.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class UserDTO {

    private Integer id;
    private String email;
    private String password;
    private Role role;
    private RegisterUser registeruser;
}
