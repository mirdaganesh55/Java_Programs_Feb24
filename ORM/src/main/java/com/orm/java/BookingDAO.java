package com.orm.java;

import java.util.List;

public interface BookingDAO {
	
	String addPassengerDao(Booking booking) ;
	public List<Booking> showPassengerDetailsDao();
	Train searchTrainNumDao(int number) ;
	Train searchTrainNumDaoFromBookTrain(int number) ;
	int getCoachPrice(int trainNo, String getCoachName) ;
	Booking getDataByPnrDao(int pnr);
	void clearDao();
	void clearDao(Booking booking);
	List<Train> showTrainDetailsDao();
	String redirectToTrainPageDao();
	String addPassengerDaoFromBookTrain(Booking booking);
	String backToBookingTicketDao();
//	  String generateCaptcha();
}
