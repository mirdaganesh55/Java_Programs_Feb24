package com.java.feb9;

public class SingletonMain {
    public static void main(String[] args) {
        // Get the singleton instance
        SingletonPOJO singleton = SingletonPOJO.getInstance();

        singleton.setData1("Hello");
        singleton.setData2(42);

        singleton.displayData();

        // Create DAO instance
        SingletonDAO singletonDAO = new SingletonDAOImpl();

        // Save data using DAO
        singletonDAO.saveData(singleton);

        // Fetch data using DAO
        SingletonPOJO fetchedSingleton = singletonDAO.fetchData();

        System.out.println("Fetched Data:");
        fetchedSingleton.displayData();
    }
}

