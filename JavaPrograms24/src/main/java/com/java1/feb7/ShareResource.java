package com.java1.feb7;

class SharedResource {
    private boolean flag = false;
    private PersonObject waitingPerson;

    // Example 8: wait() - Updated to work with Person
    synchronized void waitForFlagChange(PersonObject person) {
        while (!flag || person.getId() != waitingPerson.getId()) {
            try {
                System.out.println(person.getName() + " is waiting for flag change...");
                wait(); // Releases the lock and waits until another thread calls notify() or notifyAll()
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(person.getName() + " - Flag changed!");
    }

    // Example 9: notify() - Updated to work with Person
    synchronized void setFlag(PersonObject person) {
        flag = true;
        waitingPerson = person;
        System.out.println(person.getName() + " - Flag set to true");
        notify(); // Notifies one waiting thread
    }

    // Example 10: notifyAll() - Updated to work with Person
    synchronized void setFlagAndNotifyAll(PersonObject person) {
        flag = true;
        waitingPerson = person;
        System.out.println(person.getName() + " - Flag set to true and notifying all waiting threads");
        notifyAll(); // Notifies all waiting threads
    }
}
