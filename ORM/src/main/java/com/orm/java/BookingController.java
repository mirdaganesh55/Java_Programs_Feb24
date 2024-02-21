package com.orm.java;

import java.util.List;

public class BookingController {
	
	private BookingDAOImpl bookingdao;
	private Booking booking;
	
	public BookingDAOImpl getBookingdao() {
		return bookingdao;
	}
	public void setBookingdao(BookingDAOImpl bookingdao) {
		this.bookingdao = bookingdao;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	public String addPassenger(Booking booking) {
			return bookingdao.addPassengerDao(booking);
	}
	public String addPassengerFromBooking(Booking booking) {
		return bookingdao.addPassengerDaoFromBookTrain(booking);
	}
	public List<Booking> showPassengerDetails(){
		return bookingdao.showPassengerDetailsDao();
	}
	public Train searchTrainNum(int number)  {
			return bookingdao.searchTrainNumDao(number);
	}
	public Train searchTrainNumFromBookTrain(int number)  {
		return bookingdao.searchTrainNumDaoFromBookTrain(number);
	}
	public Booking getDataByPnr(int pnr) {
		return bookingdao.getDataByPnrDao(pnr);
	}
	public List<Train> showTrainDetails(){
		return bookingdao.showTrainDetailsDao();
	}
	public String redirectToTrainPage() {
		return bookingdao.redirectToTrainPageDao();
	}
	public String backToBookingTicket() {
		return bookingdao.backToBookingTicketDao();
	}
	/*
	 * public void clearButton() { return bookingdao.clearDao(); }
	 */
	
}
