package com.orm.java;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.imageio.ImageIO;
import javax.inject.Named;

public class BookingDAOImpl implements BookingDAO{

	SessionFactory sf;
	Session session;

	private static int generatePnr() {
		Random random = new Random();
		int randomNumber = (int) ((random.nextDouble() * 9_000_000_0L) + 1_000_000_0L);
		// Ensure the PNR starts with 6
		String pnrString = "6" + String.valueOf(randomNumber).substring(1);
		return Integer.parseInt(pnrString);
	}
	private static int generateBookinId() {
		Random random = new Random();
		int randomNumber = (int) ((random.nextDouble() * 9_000_000_0L) + 1_000_000_0L);
		// Ensure the PNR starts with 6
		String pnrString = "9" + String.valueOf(randomNumber).substring(1);
		return Integer.parseInt(pnrString);
	}

	@Override
	public String addPassengerDao(Booking booking)  {
		System.out.println("---------------------Inside the addPassengerDao");
		Map<String, Object> sessionMap =
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();		
		Train getTrainData = (Train) sessionMap.get("list");
		System.out.println(booking);
		int getPnr = generatePnr();
		int getBookingId = generateBookinId();
		booking.setBookingId(getBookingId);
		booking.setPnr(getPnr);
		booking.setTrainName(getTrainData.getTrainName());
		booking.setTrainNo(getTrainData.getNumber());
		booking.setCost(getCoachPrice(getTrainData.getNumber(), booking.getCoach()));
		booking.setStatus("Confirmed");
		booking.setTicketBookedDate(new Date());

		if(booking.getCoach().equals("sl_price")) {
			booking.setCoach("Sleeper");
		}else if (booking.getCoach().equals("TAC_price")) {
			booking.setCoach("3AC");
		}else if (booking.getCoach().equals("SAC_price")) {
			booking.setCoach("2AC");
		}else {
			booking.setCoach("1AC");
		}
		System.out.println(booking);
		session.save(booking);
		trans.commit();
		sessionMap.put("bookingDetails", booking);
		sf.close();
		//		session.close();
		return "showCfmTicket.jsp?faces-redirect=true";
	}
	@Override
	public String addPassengerDaoFromBookTrain(Booking booking)  {
		System.out.println("---------------------Inside the addPassengerDao");
		Map<String, Object> sessionMap =
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();		
		Train getTrainData = (Train) sessionMap.get("listTrain");
		System.out.println(booking);
		int getPnr = generatePnr();
		int getBookingId = generateBookinId();
		booking.setBookingId(getBookingId);
		booking.setPnr(getPnr);
		booking.setTrainName(getTrainData.getTrainName());
		booking.setTrainNo(getTrainData.getNumber());
		booking.setCost(getCoachPrice(getTrainData.getNumber(), booking.getCoach()));
		booking.setStatus("Confirmed");
		booking.setTicketBookedDate(new Date());

		if(booking.getCoach().equals("sl_price")) {
			booking.setCoach("Sleeper");
		}else if (booking.getCoach().equals("TAC_price")) {
			booking.setCoach("3AC");
		}else if (booking.getCoach().equals("SAC_price")) {
			booking.setCoach("2AC");
		}else {
			booking.setCoach("1AC");
		}
		System.out.println(booking);
		session.save(booking);
		trans.commit();
		sessionMap.put("bookingDetails", booking);
		sf.close();
		//		session.close();
		return "showCfmTicket.jsp?faces-redirect=true";
	}

	@Override
	public List<Booking> showPassengerDetailsDao() {
		Map<String, Object> sessionMap =
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Booking.class);
		/*
		 * int getTrainData = (int) sessionMap.get("list");
		 * System.out.println("------------showPassenger"+getTrainData);
		 */
		List<Booking> passengerList = criteria.list();
		session.close();
		sf.close();
		return passengerList;
	}

	@Override
	public Train searchTrainNumDaoFromBookTrain(int number) {
		System.out.println("From Book Train Ticket InSearch_Method");
		Map<String, Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Train numberfound = searchTrain(number);
		System.out.println("--------------UserNumber2"+numberfound);
		if (numberfound != null) {
			sessionMap.put("listTrain", numberfound);
		} 
		return numberfound;
	}

	@Override
	public Train searchTrainNumDao(int number) {
		System.out.println("InSearch_Method");
		Map<String, Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Train numberfound = searchTrain(number);
		System.out.println("--------------UserNumber"+numberfound);

		if (numberfound != null) {
			sessionMap.put("list", numberfound);

		} else {
			FacesMessage message = new FacesMessage("Train is not available");
			FacesContext.getCurrentInstance().addMessage("form:TrainNum", message);
		}

		//	    sf.close();
		//	    session.close();
		return numberfound;
	}
	public Train searchTrain(int number) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Train.class);
		cr.add(Restrictions.eq("number", number));
		Train number2 = (Train) cr.uniqueResult();
		sf.close();
		//		session.close();
		return number2;

	}
	@Override
	public int getCoachPrice(int trainNo, String getCoachName)  {
		SessionFactory sf= SessionHelper.getConnection();
		Session session = sf.openSession();
		Transaction trans =	session.beginTransaction();
		Criteria cr = session.createCriteria(Train.class);
		cr.add(Restrictions.eq("number", trainNo));
		Projection projection = Projections.property(getCoachName);
		cr.setProjection(projection);
		return (int) cr.uniqueResult();
	}
	@Override
	public Booking getDataByPnrDao(int pnr) {
		Map<String, Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Booking.class);
		cr.add(Restrictions.eq("pnr", pnr));
		Booking pnrData = (Booking) cr.uniqueResult();
		sessionMap.put("PnrData", pnrData);
		System.out.println(pnrData);
		if(pnrData == null) {
			FacesMessage message = new FacesMessage("PNR number not available");
			FacesContext.getCurrentInstance().addMessage("form:PnrNum", message);
			System.out.println("Number not found");
		}
		return pnrData;
	}
	@Override
	public void clearDao(Booking booking) {

		//		return "searchPNR.jsp?faces-redirect=true" ;

	}
	@Override
	public void clearDao() {
		// TODO Auto-generated method stub

	}
	@Override
	public List<Train> showTrainDetailsDao() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Train.class);
		List<Train> trainList = criteria.list();
		session.close();
		sf.close();
		return trainList;
	}
	@Override
	public String redirectToTrainPageDao() {
		// TODO Auto-generated method stub
		return  "addPassenger.jsp?faces-redirect=true";
	}
	@Override
	public String backToBookingTicketDao() {
		// TODO Auto-generated method stub
		return "addPassenger.jsp?faces-redirect=true";
	}

	public String Backbutton() {
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.clear();
		return "addPassenger.jsf?faces-redirect=true";
	}

	public void clearbutton(Booking booking) {
		booking.setPnr(0);
	}


	private static final String CAPTCHA_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	public String generateCaptcha() throws Exception {
		StringBuilder captcha = new StringBuilder();
		// Create a Random object to generate random indices for characters
		Random random = new Random();
		// Generate the captcha string
		final int length = 6;
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(CAPTCHA_CHARACTERS.length());
			char randomChar = CAPTCHA_CHARACTERS.charAt(index);
			captcha.append(randomChar);
		}
			try {
				Transaction trans=session.beginTransaction();
				UserLogin log=new UserLogin();
				log.setCaptcha(captcha.toString());
				session.save(log);
				trans.commit();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return captcha.toString();
	}
}



