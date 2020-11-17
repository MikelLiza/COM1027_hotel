/**
 * Shop.java
 */

package org.com1027.shop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * This class defines a shop with items for sale.
 * 
 * @author Stella Kazamia

 */
public class Shop {

  /** The list of items in the shop. */
  private List<IItem> items = new ArrayList<IItem>();

  /**
   * Default constructor for the shop. Not strictly needed as Java will supply its own default constructor if we do not specify any
   * constructors.
   */
  public Shop() {
    super();
  }

  /**
   * Adds an item to the shop for sale.
   * 
   * @param item
   *          the item to add.
   */
  public void addItem(IItem item) {
    this.items.add(item);
  }

  /**
   * Display the shop's catalogue, which includes both normal and sale price.
   */
  public void displayCatalogue() {
    System.out.println("Shop Catalogue");
    System.out.println();

    // Loop through each item.
    NumberFormat format = NumberFormat.getCurrencyInstance();
    System.out.println("Item\t\tPrice\tSale Price");

    for (IItem item : this.items) {
      System.out.println(item.getName() + "\t" + format.format(item.getPrice()) + "\t" + format.format(item.calculateSalePrice()));
    }
  }

  /**
   * Main entry point: this is the first method that is run.
   * 
   * @param args
   *          The command line arguments.
   */
  public static void main(String[] args) {
    // Create a shop.
    Shop shop = new Shop();

    // Add items to the shop.
    shop.addItem(new MP3Player(250.00));
    shop.addItem(new MP3Player(150.00));
    shop.addItem(new TV(499.00,26));
    shop.addItem(new TV(999.00,42));
    // Display the catalogue.
    shop.displayCatalogue();
  }
}
