package it.ErdisonDosti.service;

import it.ErdisonDosti.dao.ProductRepository;
import it.ErdisonDosti.dto.ProductDTO;
import it.ErdisonDosti.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Productservice extends AbstractService<Product,ProductDTO> {

    @Autowired
   private ProductRepository productRepository;
    public ProductDTO findProduct(Long id) {
        return converter.toDTO(((ProductRepository)repository).findProductById(id));
    }

    public void deleteProductById(Long id) {
        ((ProductRepository)repository).deleteProductById(id);
    }

    public Iterable<ProductDTO> getAllProduct() {
       return converter.toDTOList(((ProductRepository)repository).findAllProduct());
    }

    public List<ProductDTO> filter(String str) {
        return  converter.toDTOList(productRepository.findByNameContainingIgnoreCaseOrTypeProductContainingIgnoreCase(str,str));
    }
}