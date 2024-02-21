package com.orm.java;

import java.util.Date;

public class Booking {
	
	private int pnr;
	private int bookingId;
    private int trainNo;
    private String passengerName;
    private String coach;
    private int age;
    private String gender;
    private String source;
    private String destination;
    private double cost;
    private String trainName;
    private String quote;
    private String status;
    private String journeyDate;
    private Date ticketBookedDate;
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	public Date getTicketBookedDate() {
		return ticketBookedDate;
	}
	public void setTicketBookedDate(Date ticketBookedDate) {
		this.ticketBookedDate = ticketBookedDate;
	}
	@Override
	public String toString() {
		return "Booking [pnr=" + pnr + ", bookingId=" + bookingId + ", trainNo=" + trainNo + ", passengerName="
				+ passengerName + ", coach=" + coach + ", age=" + age + ", gender=" + gender + ", source=" + source
				+ ", destination=" + destination + ", cost=" + cost + ", trainName=" + trainName + ", quote=" + quote
				+ ", status=" + status + ", journeyDate=" + journeyDate + ", ticketBookedDate=" + ticketBookedDate
				+ "]";
	}
	public Booking(int pnr, int bookingId, int trainNo, String passengerName, String coach, int age, String gender,
			String source, String destination, double cost, String trainName, String quote, String status,
			String journeyDate, Date ticketBookedDate) {
		super();
		this.pnr = pnr;
		this.bookingId = bookingId;
		this.trainNo = trainNo;
		this.passengerName = passengerName;
		this.coach = coach;
		this.age = age;
		this.gender = gender;
		this.source = source;
		this.destination = destination;
		this.cost = cost;
		this.trainName = trainName;
		this.quote = quote;
		this.status = status;
		this.journeyDate = journeyDate;
		this.ticketBookedDate = ticketBookedDate;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
