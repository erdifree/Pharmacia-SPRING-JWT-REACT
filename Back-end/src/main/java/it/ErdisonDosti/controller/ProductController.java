package it.ErdisonDosti.controller;


import it.ErdisonDosti.dto.ProductDTO;
import it.ErdisonDosti.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/api/v1/managment/prodotto")
@CrossOrigin

public class ProductController extends AbstractController<ProductDTO> {
    @Autowired
    private Productservice productservice;

    // Get all product from DB
    @GetMapping
    public Iterable<ProductDTO> getAllProduct() {
        return productservice.getAllProduct();
    }

    @GetMapping("/paginable")
    public Page<ProductDTO> getPageProduct() {
        return productservice.getPageProduct();
    }

    //Read a product by id
    @GetMapping("/{id}")
    public ProductDTO read(@PathVariable Integer id) {
        return productservice.findProduct(id);
    }

    //Delite a product by ID
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        productservice.deleteProductById(id);
    }

    //Create a product
    @PostMapping
    public void insertProduct(@RequestBody ProductDTO productDTO) {
        productservice.insert(productDTO);
    }


    // find product by name
    @GetMapping("/filter")
    public List<ProductDTO> getByName(@RequestParam(name = "name", required = false) String str) {
       return productservice.filter(str);
    }
}
