package it.ErdisonDosti.converter;

import it.ErdisonDosti.dto.ProductDTO;

import it.ErdisonDosti.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter extends AbstractConverter<Product, ProductDTO> {

    @Override
    public Product toEntity(ProductDTO productDTO) {
        Product product=null;
        if (productDTO != null) {
           product= Product.builder()
                    .id(productDTO.getId())
                    .name(productDTO.getName())
                    .typeProduct(productDTO.getTypeProduct())
                    .codeProduct(productDTO.getCodeProduct())
                    .price(productDTO.getPrice())
                    .quantity(productDTO.getQuantity())
                    .description(productDTO.getDescription())
                    .build();
        }
        return product;
    }

    @Override
    public ProductDTO toDTO(Product product) {
        ProductDTO productDTO=null;
        if (product != null) {
            productDTO= ProductDTO.builder()
                    .id(product.getId())
                    .name(product.getName())
                    .typeProduct(product.getTypeProduct())
                    .codeProduct(product.getCodeProduct())
                    .price(product.getPrice())
                    .quantity(product.getQuantity())
                    .description(product.getDescription())
                    .build();
        }
        return productDTO;
    }




}
