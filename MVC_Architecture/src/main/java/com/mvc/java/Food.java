package com.mvc.java;

public class Food {
	
	private int id;
    private String item;
    private int price;
    private String imageUrl;
    
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", item=" + item + ", price=" + price + ", imageUrl=" + imageUrl + "]";
	}
	public Food(int id, String item, int price, String imageUrl) {
		super();
		this.id = id;
		this.item = item;
		this.price = price;
		this.imageUrl = imageUrl;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
}
