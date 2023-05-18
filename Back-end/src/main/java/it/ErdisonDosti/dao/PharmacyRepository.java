package it.ErdisonDosti.dao;


import it.ErdisonDosti.entity.Pharmacy;
import it.ErdisonDosti.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PharmacyRepository extends JpaRepository<Pharmacy,Integer> {



}
