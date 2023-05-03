package it.ErdisonDosti.dao;

import java.util.Optional;

import it.ErdisonDosti.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
