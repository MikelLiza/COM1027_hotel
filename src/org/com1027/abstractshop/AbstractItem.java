/**
 * AbstractItem.java
 */

package org.com1027.abstractshop;

/**
 * @author Stella Kazamia
 */
public abstract class AbstractItem implements IItem {

  /** Defines the current price of the item. */
  private double price = 0;

  /**
   * Constructs an item object with an initial price.
   * 
   * @param price
   *          the initial price of the item.
   */
  public AbstractItem(double price) {
    super();
    this.price = price;
  }

  /**
   * @return the current price of the item.
   * 
   * @see org.com1027.shop.IItem#getPrice()
   */
  @Override
  public double getPrice() {
    return this.price;
  }

  /**
   * @param price
   *          defines the new item price.
   * 
   * @see org.com1027.shop.IItem#setPrice(double)
   */
  @Override
  public void setPrice(double price) {
    this.price = price;
  }
}
