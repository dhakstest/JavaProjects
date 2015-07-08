package com.generic.test;

public class Product {

	private int Pid;

	private String Model;
	private double Price;

	public Product(int pid, String model, double price) {
		super();
		Pid = pid;
		Model = model;
		Price = price;
	}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		this.Pid = pid;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		this.Model = model;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		this.Price = price;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [Product_id=");
		builder.append(Pid);
		builder.append(", Model_No.=");
		builder.append(Model);
		builder.append(", Price");
		builder.append(Price);
		builder.append("]");
		return builder.toString();

	}
}