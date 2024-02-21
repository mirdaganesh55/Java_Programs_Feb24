package com.mvc.java;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FoodDAOImpl implements FoodDAO {
	
	SessionFactory sf;
	Session session;
	
	@Override
	public List<Food> getFoodList() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Food.class);
		List<Food> foodList = criteria.list();
		return foodList;
	}
}
