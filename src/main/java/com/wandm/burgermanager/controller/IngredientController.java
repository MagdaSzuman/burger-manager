package com.wandm.burgermanager.controller;

import com.wandm.burgermanager.exceptions.BurgerDoesNotExistException;
import com.wandm.burgermanager.model.IngredientModel;
import com.wandm.burgermanager.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class IngredientController {

    private IngredientRepository ingredientRepository;
    //private IngredientService ingredientService;

//    @Autowired
//    public IngredientController(IngredientRepository ingredientRepository, IngredientService ingredientService) {
//        this.ingredientRepository = ingredientRepository;
//        this.ingredientService = ingredientService;
//    }

    @Autowired
    public IngredientController(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @GetMapping("/ingredientAll")
    public List<IngredientModel> findAllIngredients() {
        return ingredientRepository.findAll();
    }

    @GetMapping("/findIngredientById")
    public Optional<IngredientModel> findIngredientById(@RequestParam(value = "id") Integer id) {
        return ingredientRepository.findById(id);
    }

    @GetMapping("/findIngredientByName")
    public IngredientModel findIngredientByName(@RequestParam(value = "name_ingredient") String name_ingredient) {
        return ingredientRepository.findByNameIngredient(name_ingredient);
    }

    @PostMapping("/api/addNewIngredient")
    public Integer createNewIngredient(@RequestBody IngredientModel ingredientModel) {
        IngredientModel save = ingredientRepository.save(ingredientModel);
        return save.getId();
    }

    @DeleteMapping("/api/deleteIngredientById/{id}")
    public void deleteIngredientById(@PathVariable("id") Integer id) throws BurgerDoesNotExistException {
        Optional<IngredientModel> byId = ingredientRepository.findById(id);
        if(!byId.isPresent()) throw new BurgerDoesNotExistException();
        byId.ifPresent(p->ingredientRepository.delete(p));
    }

    @DeleteMapping("/api/deleteIngredientByName/{name_ingredient}")
    public void deleteIngredientByName(@PathVariable("name_ingredient") String name_ingredient) throws BurgerDoesNotExistException {
        Optional<IngredientModel> nameToDelete = Optional.ofNullable(ingredientRepository.findByNameIngredient(name_ingredient));
        if(!nameToDelete.isPresent()) throw new BurgerDoesNotExistException();
        nameToDelete.ifPresent(p->ingredientRepository.delete(p));
    }

    @DeleteMapping("/api/deleteAllIngredients")
    public void deleteAllIngrediets() {
        ingredientRepository.deleteAll();
    }

}
