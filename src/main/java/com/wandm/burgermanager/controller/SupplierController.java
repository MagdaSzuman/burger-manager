package com.wandm.burgermanager.controller;


import com.wandm.burgermanager.exceptions.ThingDoesNotExistException;
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
        return supplierRepository.findById(Long.valueOf(id));
    }

    @GetMapping("/findSupplierByName")
    public SupplierModel findSupplierByName(@RequestParam(value = "name_supplier") String name_supplier) {
        return supplierRepository.findByName(name_supplier);
    }

    @PostMapping("/addNewSupplier")
    public Integer createNewSupplier (@RequestBody SupplierModel supplierModel) {
        SupplierModel save = supplierRepository.save(supplierModel);
        return save.getId_supplier();
    }

    @DeleteMapping("/deleteSupplier/{id}")
    public void deleteSupplierById(@PathVariable("id") Integer id) throws ThingDoesNotExistException {
        Optional<SupplierModel> byId = supplierRepository.findById(Long.valueOf(id));
        if(!byId.isPresent()) throw new ThingDoesNotExistException();
        byId.ifPresent(p->supplierRepository.delete(p));
    }

    @DeleteMapping("/deleteSupplier/{name_supplier}")
    public void deleteProductByName(@PathVariable("name_supplier") String name_supplier) throws ThingDoesNotExistException {
        SupplierModel nameToDelete = supplierRepository.findByName(name_supplier);
        if(!name_supplier.equals(supplierRepository.findByName(name_supplier))) throw new ThingDoesNotExistException();
        supplierRepository.delete(nameToDelete);
    }

    @DeleteMapping("/deleteAllSuppliers")
    public void deleteAllProducts() {
        supplierRepository.deleteAll();
    }
}