package com.example.lld_patterns.decorater.pizzaShop;

import com.example.lld_patterns.decorater.pizzaShop.toppings.Extracheese;
import com.example.lld_patterns.decorater.pizzaShop.toppings.Mushrooms;
import com.example.lld_patterns.decorater.pizzaShop.toppings.SweetCorn;

public class PizzaOrderingScreen {
    public static void main(String[] args) {
        Pizza margherita = new Margherita();
        margherita.showCost();
        Pizza extraCheeseMargherita = new Extracheese(margherita);
        extraCheeseMargherita.showCost();
        Pizza mushroomsExtraCheeseMargherita = new Mushrooms(extraCheeseMargherita);
        mushroomsExtraCheeseMargherita.showCost();
        Pizza sweetCornMushroomsExtraCheeseMargherita = new SweetCorn(mushroomsExtraCheeseMargherita);
        sweetCornMushroomsExtraCheeseMargherita.showCost();
    }
}
