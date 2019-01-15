package com.wandm.burgermanager.controller;



import com.wandm.burgermanager.exceptions.ThingDoesNotExistException;
import com.wandm.burgermanager.model.ProductModel;
import com.wandm.burgermanager.repository.ProductRepository;
import com.wandm.burgermanager.serivce.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    private ProductRepository productRepository;
    private ProductService productService;

    @Autowired
    public ProductController(ProductRepository productRepository, ProductService productService) {
        this.productRepository = productRepository;
        this.productService = productService;
    }

    @GetMapping("/productAll")
    public List<ProductModel> findAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/findProductById")
    public Optional<ProductModel> findProductById(@RequestParam(value = "id") Integer id) {
        return productRepository.findById(Long.valueOf(id));
    }

    @GetMapping("/findProductByName")
    public ProductModel findProductByName(@RequestParam(value = "name_burger") String nameBurger) {
        return productRepository.findByNameBurger(nameBurger);
    }

    @PostMapping("/addNewProduct")
    public Integer createNewProduct (@RequestBody ProductModel productModel) {
        ProductModel save = productRepository.save(productModel);
        return save.getId();
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProductById(@PathVariable("id") Integer id) throws ThingDoesNotExistException {
        Optional<ProductModel> byId = productRepository.findById(Long.valueOf(id));
        if(!byId.isPresent()) throw new ThingDoesNotExistException();
        byId.ifPresent(p->productRepository.delete(p));
    }

    @DeleteMapping("/deleteProduct/{name_burger}")
    public void deleteProductByName(@PathVariable("name_burger") String nameBurger) throws ThingDoesNotExistException {
        ProductModel nameToDelete = productRepository.findByNameBurger(nameBurger);
        if(!nameBurger.equals(productRepository.findByNameBurger(nameBurger))) throw new ThingDoesNotExistException();
        productRepository.delete(nameToDelete);
    }

    @DeleteMapping("/deleteAllProducts")
    public void deleteAllProducts() {
        productRepository.deleteAll();
    }
}


