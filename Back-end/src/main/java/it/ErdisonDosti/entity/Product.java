package it.ErdisonDosti.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;



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
}
