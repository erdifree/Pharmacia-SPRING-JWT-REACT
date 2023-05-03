package it.ErdisonDosti.dao;


import it.ErdisonDosti.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query(value = "SELECT * FROM PRODUCT p ", nativeQuery = true)
    Iterable<Product> findAllProduct();
    @Query(value = "SELECT * FROM product WHERE id = :productId", nativeQuery = true)
    Product findProductById(@Param("productId") Long productId);

    @Modifying
    @Query(value = "DELETE FROM product WHERE id = :idtodelete", nativeQuery = true)
    void deleteProductById(@Param("idtodelete") Long productId);

    List<Product> findByNameContainingIgnoreCaseOrTypeProductContainingIgnoreCase(String name, String type);


}
