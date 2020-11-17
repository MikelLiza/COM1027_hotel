package org.com1027.shop;

public class TV implements IItem {

	private double price = 0;
	private int size = 0;
	
	public TV(double price, int size)  {
		super();
		this.price = price;
		this.size = size;
	}
	public int getSize()  {
		return size;
	}
	@Override
	public double calculateSalePrice() {
		// TODO Auto-generated method stub
		return (price * 0.80);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return ("TV" + "(" + getSize() + "\")" + " " );
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		this.price = price;
	}

}
