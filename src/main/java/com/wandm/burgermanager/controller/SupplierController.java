package com.wandm.burgermanager.controller;

import com.wandm.burgermanager.exceptions.BurgerDoesNotExistException;
import com.wandm.burgermanager.model.SupplierModel;
import com.wandm.burgermanager.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SupplierController {

    private SupplierRepository supplierRepository;
    //private SupplierService supplierService;

    //@Autowired
//    public SupplierController(SupplierRepository supplierRepository, SupplierService supplierService) {
//        this.supplierRepository = supplierRepository;
//        this.supplierService = supplierService;
//    }

    @Autowired
    public SupplierController(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @GetMapping("/supplierAll")
    public List<SupplierModel> findAllProducts() {
        return supplierRepository.findAll();
    }

    @GetMapping("/findSupplierById")
    public Optional<SupplierModel> findSupplierById(@RequestParam(value = "id") Integer id) {
        return supplierRepository.findById(id);
    }

    @GetMapping("/findSupplierByName")
    public SupplierModel findSupplierByName(@RequestParam(value = "name_supplier") String name_supplier) {
        return supplierRepository.findByNameSupplier(name_supplier);
    }

    @PostMapping("/api/addNewSupplier")
    public Integer createNewSupplier (@RequestBody SupplierModel supplierModel) {
        SupplierModel save = supplierRepository.save(supplierModel);
        return save.getId_supplier();
    }

    @DeleteMapping("/api/deleteSupplierById/{id}")
    public void deleteSupplierById(@PathVariable("id") Integer id) throws BurgerDoesNotExistException {
        Optional<SupplierModel> byId = supplierRepository.findById(id);
        if(!byId.isPresent()) throw new BurgerDoesNotExistException();
        byId.ifPresent(p->supplierRepository.delete(p));
    }

    @DeleteMapping("/api/deleteSupplierByName/{name_supplier}")
    public void deleteSupplierByName(@PathVariable("name_supplier") String name_supplier) throws BurgerDoesNotExistException {
        Optional<SupplierModel> nameToDelete = Optional.ofNullable(supplierRepository.findByNameSupplier(name_supplier));
        if(!nameToDelete.isPresent()) throw new BurgerDoesNotExistException();
        nameToDelete.ifPresent(p->supplierRepository.delete(p));
    }

    @DeleteMapping("/api/deleteAllSuppliers")
    public void deleteAllSuppliers() {
        supplierRepository.deleteAll();
    }
}
