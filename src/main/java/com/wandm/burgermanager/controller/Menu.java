package com.wandm.burgermanager.controller;


import com.wandm.burgermanager.controller.menu.BurgerRecipes;

import java.util.HashMap;

import java.util.Scanner;

public class RecipesModel {

    private Scanner sc = new Scanner(System.in);
    private ProductController productMap= new ProductController(new HashMap< >());
    private IngredientController ingredientList= new IngredientController();


    public void showMenu() {
        System.out.println();
        System.out.println("===========================================================================");
        System.out.println("Wybierz menu");
        System.out.println("1. Burger");
        System.out.println("2. Stan magazynowy");
        System.out.println("3. Zakończ");


        switch (sc.nextInt()) {
            case 1:

                BurgerRecipes burgerRecipes = new BurgerRecipes(sc, productMap);
                burgerRecipes.showMenu();
                break;

            default:
                System.out.println("Wybrałeś niewspieraną opcje");
        }
    }
}
