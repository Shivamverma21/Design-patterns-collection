package com.example.lld_patterns.decorater.pizzaShop;

public class VegDelight implements Pizza {

    @Override
    public int cost() {
        return 200;
    }
    @Override
    public String name() {
        return "Veg Delight";
    }
    @Override
    public void showCost(){
        System.out.println(name() + " cost: $" + cost());
    }
}
