package com.example.lld_patterns.singleton.dataBaseConnectionPool;

public class DatabaseConnectionPool {
    private static DatabaseConnectionPool instance;
    private DatabaseConnectionPool() {
        System.out.println("DatabaseConnectionPool Instance got created");
    }
    public static DatabaseConnectionPool getInstance(String client) {
        System.out.println("Got DatabaseConnectionPool Instance creation request from "+ client );
        if (instance != null) {
            System.out.println("DatabaseConnectionPool Instance already exist");
            return instance;
        }
        else {
            return instance=new DatabaseConnectionPool();
        }
    }
    public void getConnection() {
        System.out.println("Connection retrieved from the pool.");
    }
}
