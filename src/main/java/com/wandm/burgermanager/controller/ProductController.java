package com.wandm.burgermanager.controller;



import com.wandm.burgermanager.exceptions.ThingDoesNotExistException;
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
        return productRepository.findById(Integer.valueOf(id));
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

    @DeleteMapping("/deleteProductById/{id}")
    public void deleteProductById(@PathVariable ("id") Integer id) throws ThingDoesNotExistException {
        Optional<ProductModel> byId = productRepository.findById(Integer.valueOf(id));
        if(!byId.isPresent()) throw new ThingDoesNotExistException();
        byId.ifPresent(p->productRepository.delete(p));
    }

    @DeleteMapping("/deleteProductByName/{nameBurger}")
    public void deleteProductByName(@PathVariable(value = "nameBurger") String nameBurger) throws ThingDoesNotExistException {
        Optional<ProductModel> nameToDelete = Optional.ofNullable(productRepository.findByNameBurger(nameBurger));
        if(!nameToDelete.isPresent()) throw new ThingDoesNotExistException();
        nameToDelete.ifPresent(p->productRepository.delete(p));
    }

    @DeleteMapping("/deleteAllProducts")
    public void deleteAllProducts() {
        productRepository.deleteAll();
    }


}


