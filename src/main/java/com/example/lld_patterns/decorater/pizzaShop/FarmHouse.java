package com.example.lld_patterns.decorater.pizzaShop;

public class FarmHouse implements Pizza {

    @Override
    public int cost() {
        return 150;
    }

    @Override
    public String name() {
        return "FarmHouse";
    }
    @Override
    public void showCost(){
        System.out.println(name() + " cost: $" + cost());
    }
}
