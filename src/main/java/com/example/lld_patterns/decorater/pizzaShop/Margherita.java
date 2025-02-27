package com.example.lld_patterns.decorater.pizzaShop;

public class Margherita implements Pizza {

    @Override
    public int cost(){
        return 100;
    }
    @Override
    public String name(){
        return "Margherita";
    }
    @Override
    public void showCost(){
        System.out.println(name() + " cost: $" + cost());
    }
}
