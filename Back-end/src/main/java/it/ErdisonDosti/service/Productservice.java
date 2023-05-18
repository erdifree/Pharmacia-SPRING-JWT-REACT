package it.ErdisonDosti.service;

import it.ErdisonDosti.dao.ProductRepository;
import it.ErdisonDosti.dto.ProductDTO;

import it.ErdisonDosti.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class Productservice extends AbstractService<Product,ProductDTO> {

    @Autowired

   private ProductRepository productRepository;
    public ProductDTO findProduct(Integer id) {
        return converter.toDTO(((ProductRepository)repository).findProductById(id));
    }

    public void deleteProductById(Integer id) {

        ((ProductRepository)repository).deleteProductById(id);
    }

    public Iterable<ProductDTO> getAllProduct() {
       return converter.toDTOList(((ProductRepository)repository).findAllProduct());
    }

    public List<ProductDTO> filter(String str) {
        return  converter.toDTOList(productRepository.findByNameContainingIgnoreCaseOrTypeProductContainingIgnoreCase(str,str));
    }



    public Page<ProductDTO> getPageProduct() {
        PageRequest pr= PageRequest.of(1,10);
        return (Page<ProductDTO>) converter.toDTOList(((ProductRepository)repository).findAll(pr));
    }
}