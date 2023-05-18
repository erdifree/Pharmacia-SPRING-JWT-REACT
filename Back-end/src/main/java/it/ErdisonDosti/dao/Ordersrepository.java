package it.ErdisonDosti.dao;


import it.ErdisonDosti.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface Ordersrepository extends JpaRepository<Orders,Integer> {

}
