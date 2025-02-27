package com.example.lld_patterns.decorater.pizzaShop.toppings;

import com.example.lld_patterns.decorater.pizzaShop.Pizza;

public class Extracheese implements ToppingDecorator {

    private String toppingName="Extracheese";

    Pizza pizza;
    public Extracheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost()+33;
    }
    @Override
    public String name() {
        return pizza.name() + " " + toppingName;
    }
    @Override
    public void showCost(){
        System.out.println(name() + " cost: $" + cost());
    }

}
