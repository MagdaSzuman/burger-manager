package com.wandm.burgermanager.controller.menu;

import com.wandm.burgermanager.controller.IngredientController;
import com.wandm.burgermanager.controller.ProductController;
import com.wandm.burgermanager.serivce.IngredientService;

import java.util.Scanner;

public class BurgerRecipes {
    private Scanner sc;
    private ProductController productController;
    private IngredientService ingredientService;

    public BurgerRecipes(Scanner sc, ProductController productController, IngredientService ingredientService) {
        this.sc = sc;
        this.productController = productController;
        this.ingredientService = ingredientService;
    }

    public BurgerRecipes(Scanner sc, ProductController productMap, IngredientController ingredientList) {
    }

    public void showMenu() {

        while (true) {
            System.out.println();
            System.out.println("===========================================================================");
            System.out.println("1. Classic");
            System.out.println("2. BBQ");
            System.out.println("3. Cheesee");
            System.out.println("4. Powrót");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    String dataFromUser = sc.nextLine();
                 //  ingredientService.classic(dataFromUser);
                    break;
                case 2:
                    String dataFromUser2 = sc.nextLine();
                  //  ingredientService.bbq(dataFromUser2);
                    break;
                case 3:
                    String dataFromUser3 = sc.nextLine();
                   // ingredientService.cheesee(dataFromUser3);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wybrałeś niewspieraną opcje");
            }
        }
    }
}
