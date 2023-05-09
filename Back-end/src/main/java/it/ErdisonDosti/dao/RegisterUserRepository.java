package it.ErdisonDosti.dao;

import it.ErdisonDosti.entity.RegisterUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterUserRepository extends JpaRepository<RegisterUser,Integer> {

}
