package com.example.lld_patterns.decorater.pizzaShop.toppings;

import com.example.lld_patterns.decorater.pizzaShop.Pizza;

public class Mushrooms implements ToppingDecorator {
    private String toppingName="Mushrooms";
    Pizza pizza;
    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost()+66;
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
