package com.orm.java;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class StationDAOImpl implements StationDAO{
	
	 private String shortName;
	 private List<String> fullNameList;
	
	 public List<String> getFullNameList() {
		 return fullNameList;
	 }

	 public String getShortName() {
		 return shortName;
	 }

	 public void setShortName(String shortName) {
		 this.shortName = shortName;
	 }
	 
	 public void autoCompleteFullName() {
	        // Call your method to get full names based on shortName
	        fullNameList = getFullNameByShortName(shortName);
	    }

	SessionFactory sf;
	Session session;
	
	@Override
	public List<String> getFullNameByShortName(String shortName) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session=sf.openSession();
		Criteria criteria = session.createCriteria(Station.class);
//		Projection projection = Projections.property("fullName");
		 criteria.add(Restrictions.eq("shortName", shortName));
		Projection projection = Projections.distinct(Projections.property("fullName")); 
		criteria.setProjection(projection);
		List<String> stationList = criteria.list();
//		System.out.println("-----------"+stationList);
		return stationList;
	}

	
}
