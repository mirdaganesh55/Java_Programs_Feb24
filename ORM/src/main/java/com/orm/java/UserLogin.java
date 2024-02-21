package com.orm.java;

public class UserLogin {
	
	private int id;
	private String username;
	private String password;
	private String captcha;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCaptcha() {
		return captcha;
	}
	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
	@Override
	public String toString() {
		return "UserLogin [id=" + id + ", username=" + username + ", password=" + password + ", captcha=" + captcha
				+ "]";
	}
	public UserLogin(int id, String username, String password, String captcha) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.captcha = captcha;
	}
	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
}
