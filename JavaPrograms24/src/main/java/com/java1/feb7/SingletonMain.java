package com.java1.feb7;

public class SingletonMain {
	
	public static void main(String[] args) {
        // Get the singleton instance
        Singleton singletonInstance = Singleton.getInstance();

        // Print the initial object state
        System.out.println("Initial Object State: " + singletonInstance.getObjectState());

        // Modify the object state
        singletonInstance.setObjectState("New Object State");

        // Print the updated object state
        System.out.println("Updated Object State: " + singletonInstance.getObjectState());
    }
	
}
