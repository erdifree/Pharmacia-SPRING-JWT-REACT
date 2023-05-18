package it.ErdisonDosti.dto;


import it.ErdisonDosti.Token.Token;
import it.ErdisonDosti.entity.Pharmacy;
import it.ErdisonDosti.entity.RegisterUser;
import it.ErdisonDosti.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Integer id;
    private String email;
    private String password;
    private Role role;
    private RegisterUser registeruser;
    private Pharmacy pharmacy;
}
