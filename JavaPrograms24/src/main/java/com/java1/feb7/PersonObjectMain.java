package com.java1.feb7;

public class PersonObjectMain {
    public static void main(String[] args) {
//        SharedResource sharedResource = new SharedResource();
    	 SharedResource sharedResource = new SharedResource();
        PersonObject person1 = new PersonObject(1, "Alice", 25);
        PersonObject person2 = new PersonObject(2, "Bob", 30);

        // Example 1: toString()
        // The toString() method returns a string representation of the object.
        System.out.println("Example 1 - toString(): " + person1.toString());

        // Example 2: equals()
        // The equals() method checks if two objects are equal.
        System.out.println("Example 2 - equals(): " + person1.equals(person2));

        // Example 3: hashCode()
        // The hashCode() method returns a hash code value for the object.
        System.out.println("Example 3 - hashCode(): " + person1.hashCode());

        // Example 4: getClass()
        // The getClass() method returns the runtime class of the object.
        System.out.println("Example 4 - getClass(): " + person1.getClass());
        
        Thread waitThread1 = new Thread(() -> sharedResource.waitForFlagChange(person1));
        waitThread1.start();

        // Creating a thread that sets the flag and notifies the waiting thread with person2
        Thread setFlagThread = new Thread(() -> sharedResource.setFlag(person2));
        setFlagThread.start();

        // ... (similarly, you can create more threads with different persons)

        // Introducing a delay before setting the flag and notifying all waiting threads
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Creating a thread that sets the flag and notifies all waiting threads with person1
        Thread setFlagAndNotifyAllThread = new Thread(() -> sharedResource.setFlagAndNotifyAll(person1));
        setFlagAndNotifyAllThread.start();
    }
    }
    



