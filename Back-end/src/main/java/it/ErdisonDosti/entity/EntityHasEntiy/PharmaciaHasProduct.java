package it.ErdisonDosti.entity.EntityHasEntiy;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import it.ErdisonDosti.entity.Pharmacy;
import it.ErdisonDosti.entity.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PharmaciaHasProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "quantiy_available")
    private Integer  quantity;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pharmacy_id", nullable = false)
    @JsonBackReference
    private Pharmacy pharmacy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    @JsonManagedReference
    private Product product;



}
