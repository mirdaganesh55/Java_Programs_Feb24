package com.java.feb9;

public interface SingletonDAO {

	void saveData(SingletonPOJO singletonPOJO);
	SingletonPOJO fetchData();

}
