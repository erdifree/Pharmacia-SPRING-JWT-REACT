package it.ErdisonDosti.entity;


import com.fasterxml.jackson.annotation.*;
import it.ErdisonDosti.Token.Token;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class User implements UserDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String email;
  private String password;

  @Enumerated(EnumType.STRING)
  private Role role;

  @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
  private RegisterUser registeruser;

  @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
  @JsonManagedReference
  private Pharmacy pharmacia;

  @OneToMany(mappedBy = "user")
  private List<Token> tokens;


  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return role.getAuthorities();
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return email;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
