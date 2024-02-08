package com.java.feb7;

public class MathDAOImpl implements MathDAO{
	
	

	@Override
	public double add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double divide(int a , int b) {
		 if (b != 0) {
	            return a / b;
	        } else {
	            throw new ArithmeticException("Cannot divide by zero.");
	        }
	}

	@Override
	public double minus() {
		// TODO Auto-generated method stub
		return 0;
	}
}
