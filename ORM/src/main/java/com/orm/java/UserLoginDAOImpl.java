package com.orm.java;

import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class UserLoginDAOImpl implements UserLoginDAO{
	
	SessionFactory sf;
	Session session;

	@Override
	public String loginDao(UserLogin userLogin) {
		sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(UserLogin.class);
		cr.add(Restrictions.eq("username",userLogin.getUsername()));
		cr.add(Restrictions.eq("password",userLogin.getPassword()));
		
		cr.setProjection(Projections.rowCount());
		System.out.println("Called from Logindao "+userLogin);
		long count = (long) cr.uniqueResult();
		
		if(count == 1) {
			
			String username=userLogin.getUsername();
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("username", username);
			return"addPassenger.jsf?faces-redirect=true";
		}
		
		else {
			Map<String,Object> sessionMap =
					FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap.put("passWordErr3", "Incorrect UserName or Password.");
		}
		return "";
	}

}
