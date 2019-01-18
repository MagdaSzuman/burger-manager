package com.wandm.burgermanager.controller;

import com.wandm.burgermanager.exceptions.BurgerDoesNotExistException;
import com.wandm.burgermanager.model.ProductModel;
import com.wandm.burgermanager.repository.ProductRepository;
import com.wandm.burgermanager.service.ProductService;
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
        return productRepository.findById(id);
    }

    @GetMapping("/findProductByName")
    public ProductModel findProductByName(@RequestParam(value = "name_burger") String name_burger) {
        return productRepository.findByNameBurger(name_burger);
    }

    @PostMapping("/api/addNewProduct")
    public Integer createNewProduct (@RequestBody ProductModel productModel) {
        ProductModel save = productRepository.save(productModel);
        return save.getId();
    }

    @DeleteMapping("/api/deleteProductById/{id}")
    public void deleteProductById(@PathVariable(value = "id") Integer id) throws BurgerDoesNotExistException {
        Optional<ProductModel> byId = productRepository.findById(id);
        if(!byId.isPresent()) throw new BurgerDoesNotExistException();
        byId.ifPresent(p->productRepository.delete(p));
    }

    @DeleteMapping("/api/deleteProductByName/{nameBurger}")
    public void deleteProductByName(@PathVariable(value = "nameBurger") String name_burger) throws BurgerDoesNotExistException {
        Optional<ProductModel> nameToDelete = Optional.ofNullable(productRepository.findByNameBurger(name_burger));
        if(!nameToDelete.isPresent()) throw new BurgerDoesNotExistException();
        nameToDelete.ifPresent(p->productRepository.delete(p));
    }

    @DeleteMapping("/api/deleteAllProducts")
    public void deleteAllProducts() {
        productRepository.deleteAll();
    }
}
