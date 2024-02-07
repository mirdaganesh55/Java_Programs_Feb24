package com.java1.feb7;

public class StaticClassExample  
{  
	private static String str = "Javatpoint";  
	//nested class which is a Static class  
	public static class StaticDemo  
	{  
		//non-static method of Static class  
		public void show()   
		{  
			System.out.println(str);   
		}  
	}
}