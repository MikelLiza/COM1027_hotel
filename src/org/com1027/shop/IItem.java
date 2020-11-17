/**
 * IItem.java
 */

package org.com1027.shop;

/**
 * Defines the expected behaviour for any class which defines an item in a shop.
 * 
 * @author Stella Kazamia
 */
public interface IItem {

	/**
	 * Calculates the price at which the item should be sold in a sale.
	 * 
	 * @return the sale price.
	 */
	public double calculateSalePrice();

	/**
	 * @return the name of the item.
	 */
	public String getName();

	/**
	 * @return the current price of the item.
	 */
	public double getPrice();

	/**
	 * @param price defines the new item price.
	 */
	public void setPrice(double price);
}
