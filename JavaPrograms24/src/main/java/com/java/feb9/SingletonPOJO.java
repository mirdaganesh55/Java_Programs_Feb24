package com.java.feb9;

public class SingletonPOJO {
    private static SingletonPOJO instance;

    private String data1;
    private int data2;

    private SingletonPOJO() {
    }

    public static SingletonPOJO getInstance() {
        if (instance == null) {
            instance = new SingletonPOJO();
        }
        return instance;
    }

    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    public void displayData() {
        System.out.println("Data1: " + data1 + ", Data2: " + data2);
    }
}

