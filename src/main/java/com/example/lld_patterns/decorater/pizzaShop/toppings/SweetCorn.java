package com.example.lld_patterns.decorater.pizzaShop.toppings;

import com.example.lld_patterns.decorater.pizzaShop.Pizza;

public class SweetCorn implements ToppingDecorator {
    private String toppingName="Sweet Corn";
    Pizza pizza;
    public SweetCorn(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return pizza.cost()+80;
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
