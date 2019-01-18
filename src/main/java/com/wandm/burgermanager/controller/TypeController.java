package com.wandm.burgermanager.controller;


import com.wandm.burgermanager.exceptions.BurgerDoesNotExistException;
import com.wandm.burgermanager.model.TypeModel;
import com.wandm.burgermanager.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TypeController {

    private TypeRepository typeRepository;

    @Autowired
    public TypeController(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @GetMapping("/typeAll")
    public List<TypeModel> findAllProducts() {
        return typeRepository.findAll();
    }

    @GetMapping("/findTypeById")
    public Optional<TypeModel> findTypeById(@RequestParam(value = "id") Integer id) {
        return typeRepository.findById(id);
    }

    @GetMapping("/findTypeByName")
    public TypeModel findTypeByName(@RequestParam(value = "name_type") String name_type) {
        return typeRepository.findByName(name_type);
    }

    @PostMapping("/api/addNewType")
    public Integer createNewType (@RequestBody TypeModel typeModel) {
        return typeRepository.save(typeModel).getId();
    }

    @DeleteMapping("/api/deleteTypeById/{id}")
    public void deleteTypeById(@PathVariable("id") Integer id) throws BurgerDoesNotExistException {
        Optional<TypeModel> byId = typeRepository.findById(id);
        if(!byId.isPresent()) throw new BurgerDoesNotExistException();
        byId.ifPresent(p->typeRepository.delete(p));
    }

    @DeleteMapping("/api/deleteTypeByName/{name_type}")
    public void deleteTypeByName(@PathVariable("name_type") String name_type) throws BurgerDoesNotExistException {
        Optional<TypeModel> nameToDelete = Optional.ofNullable(typeRepository.findByName(name_type));
        if(!nameToDelete.isPresent()) throw new BurgerDoesNotExistException();
        nameToDelete.ifPresent(p->typeRepository.delete(p));
    }

    @DeleteMapping("/api/deleteAllTypes")
    public void deleteAllTypes() {
        typeRepository.deleteAll();
    }

}
