package it.ErdisonDosti.dto;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
@Builder
public class ProductDTO {
    private Integer id;
    private String name;
    private String typeProduct;
    private String codeProduct;
    private Double price;
    private Integer quantity;
    private String description;
}
