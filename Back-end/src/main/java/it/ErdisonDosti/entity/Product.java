package it.ErdisonDosti.entity;


import com.fasterxml.jackson.annotation.*;
import it.ErdisonDosti.entity.EntityHasEntiy.PharmaciaHasProduct;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Data
@Builder
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Column(name = "product_name")
    private String name;

    @NotNull
    @Column(name = "type_product")
    private String typeProduct;

    @NotNull
    @Column(name = "code_product")
    private String codeProduct;


    @NotNull
    @Column(name = "price")
    private Double price;


    @NotNull
    @Column(name = "quantity")
    private Integer quantity;


    @NotNull
    @Column(name = "description")
    private String description;

    public Product(String name, String typeProduct, String codeProduct, Double price, Integer quantity, String description) {
        this.name = name;
        this.typeProduct = typeProduct;
        this.codeProduct = codeProduct;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    //    @ManyToMany(mappedBy = "products")
//    @JsonBackReference
//    private List<Orders> orders;


    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference
    private List<PharmaciaHasProduct> pharmacyHasProducts = new ArrayList<>();



//    @ManyToMany(mappedBy = "products")
//    @JsonBackReference
//    private List<Pharmacy> pharmacies;


}
