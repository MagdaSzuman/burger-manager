package com.wandm.burgermanager.controller;


import com.wandm.burgermanager.exceptions.ThingDoesNotExistException;
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
        return ingredientRepository.findById(Integer.valueOf(id));
    }

    @GetMapping("/findIngredientByName")
    public IngredientModel findIngredientByName(@RequestParam(value = "nameIngredient") String nameIngredient) {
        return ingredientRepository.findByNameIngredient(nameIngredient);
    }

    @PostMapping("/addNewIngredient")
    public Integer createNewIngredient(@RequestBody IngredientModel ingredientModel) {
        IngredientModel save = ingredientRepository.save(ingredientModel);
        return save.getId();
    }

    @DeleteMapping("/deleteIngredient/{id}")
    public void deleteIngredientById(@PathVariable("id") Integer id) throws ThingDoesNotExistException {
        Optional<IngredientModel> byId = ingredientRepository.findById(Integer.valueOf(id));
        if(!byId.isPresent()) throw new ThingDoesNotExistException();
        byId.ifPresent(p->ingredientRepository.delete(p));
    }

    @DeleteMapping("/deleteIngredient/{nameIngredient}")
    public void deleteIngredientByName(@PathVariable("nameIngredient") String nameIngredient) throws ThingDoesNotExistException {
        IngredientModel nameToDelete = ingredientRepository.findByNameIngredient(nameIngredient);
        if(!nameIngredient.equals(ingredientRepository.findByNameIngredient(nameIngredient))) throw new ThingDoesNotExistException();
        ingredientRepository.delete(nameToDelete);
    }

    @DeleteMapping("/deleteAllIngredients")
    public void deleteAllIngrediets() {
        ingredientRepository.deleteAll();
    }

}