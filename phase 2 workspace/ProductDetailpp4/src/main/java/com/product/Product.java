package com.product;


import java.util.ArrayList;

public class Product{
	private int pid;
	private String name;
	private String delivery_address;
	private float price;
	
	public Product(int pid, String name, String delivery_address, float price){
		this.pid=pid;
		this.name=name;
		this.delivery_address=delivery_address;
		this.price=price;
	}
	
	public void setId(int pid) {
		this.pid = pid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String delivery_address) {
		this.delivery_address =delivery_address;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getId() {
		return pid;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return delivery_address;
	}

	public float getPrice() {
		return price;
	}
	
	public ArrayList<Product> getProductDetails()
	{
		ArrayList<Product> productList = new ArrayList<Product>();
		 
		productList.add(new Product(pid, name, delivery_address, price));  
		 
		 for (Product s : productList) 
			{
				System.out.print("ID, Name, Color, and Price of the product are : ");
				System.out.println(s.pid + " " + s.name + " " + s.delivery_address + " " + s.price);
			}
		return productList;
	}
}