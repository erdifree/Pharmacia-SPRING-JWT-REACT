package it.ErdisonDosti.entity;



import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import it.ErdisonDosti.entity.EntityHasEntiy.PharmaciaHasProduct;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pharmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  id;
    private String name;
    private String city;
    private Integer vatCode;
    private String address;

    @OneToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;


    @OneToMany(mappedBy = "pharmacy", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<PharmaciaHasProduct> pharmacyHasProducts = new ArrayList<>();


    @OneToMany(mappedBy = "pharmacy", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Orders> orders = new ArrayList<>();

//
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "product_has_pharmacy", joinColumns = {
//            @JoinColumn(name = "pharmacy_id",foreignKey = @ForeignKey(name = "FK_product_pharmacy"))}, inverseJoinColumns = {
//            @JoinColumn(name = "product_id",foreignKey = @ForeignKey(name = "FK_pharmacy_product"))})
//    private List<Product> products;

}
