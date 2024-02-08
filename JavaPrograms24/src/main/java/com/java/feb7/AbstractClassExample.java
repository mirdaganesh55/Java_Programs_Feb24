package com.java.feb7;

abstract class MathematicalOperations   
{   
	int a=30, b=40;  
	//abstract method  
	public abstract void add();   
}  
public class AbstractClassExample extends MathematicalOperations    
{   
	//definition of abstract method       
	public void add()   
	{  
		System.out.println("Sum of a and b is : "+(a+b));  
	}  
}