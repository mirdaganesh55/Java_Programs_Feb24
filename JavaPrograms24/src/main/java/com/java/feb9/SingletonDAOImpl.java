package com.java.feb9;

public class SingletonDAOImpl implements SingletonDAO {
    private SingletonPOJO singletonPOJO;

    @Override
    public void saveData(SingletonPOJO singletonPOJO) {
        this.singletonPOJO = singletonPOJO;
    }

    @Override
    public SingletonPOJO fetchData() {
        return singletonPOJO;
    }
}

