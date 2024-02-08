package com.java.feb7;

final class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
    	 return 3.14 * radius * radius;     
    }
}