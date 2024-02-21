package com.orm.java;

public class Station {

	private String shortName;
	private String fullName;
	
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	@Override
	public String toString() {
		return "Station [shortName=" + shortName + ", fullName=" + fullName + "]";
	}
	public Station(String shortName, String fullName) {
		super();
		this.shortName = shortName;
		this.fullName = fullName;
	}
	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}
}
