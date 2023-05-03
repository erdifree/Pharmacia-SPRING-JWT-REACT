package it.ErdisonDosti.controller;


import it.ErdisonDosti.dto.ProductDTO;
import it.ErdisonDosti.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:8080")
public class ProductController extends AbstractController<ProductDTO> {
    @Autowired
    private Productservice productservice;

    // Get all product from DB
    @GetMapping
    public Iterable<ProductDTO> getAllProduct() {
        return productservice.getAllProduct();
    }

    //Read a product by id
    @GetMapping("/{id}")
    public ProductDTO read(@PathVariable Long id) {
        return productservice.findProduct(id);
    }

    //Delite a product by ID
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
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
