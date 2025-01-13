package com.example.lld_patterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        DatabaseConnectionPool pool1 = DatabaseConnectionPool.getInstance("pool1");
        DatabaseConnectionPool pool2 = DatabaseConnectionPool.getInstance("pool2");
        pool1.getConnection();
        pool2.getConnection();
        System.out.println("pool1==pool2: "+(pool1==pool2));
    }
}
