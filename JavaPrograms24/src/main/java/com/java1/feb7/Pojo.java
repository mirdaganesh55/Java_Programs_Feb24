package com.java1.feb7;

class PojoDemo   
{  
	//private variable      
	private double price=89764.34;  
	//getter method  
	public double getPrice()   
	{  
		return price;  
	}  
	//setter method  
	public void setPrice(int price)   
	{  
		this.price = price;  
	}  
}  
//main class  
public class Pojo  
{  
	public static void main(String args[])  
	{  
		PojoDemo obj = new PojoDemo();  
		System.out.println("The price of an article is Rs "+ obj.getPrice());  
	}  
}  
