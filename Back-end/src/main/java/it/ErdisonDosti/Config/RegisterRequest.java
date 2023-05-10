package it.ErdisonDosti.Config;

import it.ErdisonDosti.entity.RegisterUser;
import it.ErdisonDosti.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String email;
    private String password;
    private RegisterUser registerUser;
    private Role role;

}
