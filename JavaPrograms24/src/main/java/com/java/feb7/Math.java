package com.java.feb7;

public class Math {

	private double operand1;
	private double operand2;
	
	public double getOperand1() {
		return operand1;
	}
	public void setOperand1(double operand1) {
		this.operand1 = operand1;
	}
	public double getOperand2() {
		return operand2;
	}
	public void setOperand2(double operand2) {
		this.operand2 = operand2;
	}
	@Override
	public String toString() {
		return "MathOperation [operand1=" + operand1 + ", operand2=" + operand2 + "]";
	}
	public Math(double operand1, double operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	public Math() {
		super();
		// TODO Auto-generated constructor stub
	}
}
