package org.com1027.abstractshop;

public class TV extends AbstractItem {
	private int size = 0;
	public TV(double price, int size) {
		super(price);
		this.size  = size;
		// TODO Auto-generated constructor stub
	}
	public int getSize()  {
		return this.size;
	}
	@Override
	public double calculateSalePrice() {
		// TODO Auto-generated method stub
		return (getPrice() * 0.80);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return ("TV (" + size + "\")" + " ");
	}

}
