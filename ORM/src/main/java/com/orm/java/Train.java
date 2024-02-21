package com.orm.java;

public class Train {

	private int number;
	private String trainName;
	private int sl_price;
	private int TAC_price;
	private int SAC_price;
	private int FAC_price;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public int getSl_price() {
		return sl_price;
	}
	public void setSl_price(int sl_price) {
		this.sl_price = sl_price;
	}
	public int getTAC_price() {
		return TAC_price;
	}
	public void setTAC_price(int tAC_price) {
		TAC_price = tAC_price;
	}
	public int getSAC_price() {
		return SAC_price;
	}
	public void setSAC_price(int sAC_price) {
		SAC_price = sAC_price;
	}
	public int getFAC_price() {
		return FAC_price;
	}
	public void setFAC_price(int fAC_price) {
		FAC_price = fAC_price;
	}
	@Override
	public String toString() {
		return "Train [number=" + number + ", trainName=" + trainName + ", sl_price=" + sl_price + ", TAC_price="
				+ TAC_price + ", SAC_price=" + SAC_price + ", FAC_price=" + FAC_price + "]";
	}
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Train(int number, String trainName, int sl_price, int tAC_price, int sAC_price, int fAC_price) {
		super();
		this.number = number;
		this.trainName = trainName;
		this.sl_price = sl_price;
		TAC_price = tAC_price;
		SAC_price = sAC_price;
		FAC_price = fAC_price;
	}
}
