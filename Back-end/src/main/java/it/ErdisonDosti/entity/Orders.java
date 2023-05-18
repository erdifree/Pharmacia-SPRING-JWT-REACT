package it.ErdisonDosti.entity;


import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private LocalDateTime aquired;
    private boolean isPayed;
    private Double totalPrice;


//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "registeredUser_id", nullable = false)
//    @JsonBackReference
//    private RegisterUser registered_user;


//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "product_has_order", joinColumns = @JoinColumn(name = "orders_id"),
//            inverseJoinColumns = @JoinColumn(name = "product_id"))
//    @JsonManagedReference
//    private List<Product> products;


//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "product_has_order", joinColumns = {
//            @JoinColumn(name = "order_id",foreignKey = @ForeignKey(name = "FK_product_order"))}, inverseJoinColumns = {
//            @JoinColumn(name = "product_id",foreignKey = @ForeignKey(name = "FK_order_product"))})
//       private List<Product> products;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pharmacy_id", nullable = false)
    @JsonBackReference
    private Pharmacy pharmacy;

}
