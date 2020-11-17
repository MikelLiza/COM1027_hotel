/**
 * Duck.java
 */

package org.com1027.animal;

/**
 * This class defines a generic duck.
 * 
 * @author Stella Kazamia

 */
public class Duck extends Animal {

  /**
   * Constructor requiring the animal's name.
   * 
   * @param name
   *          the name of the animal.
   */
  public Duck(String name) {
    super(name);
    System.out.println("In Duck constructor");
  }

  /**
   * @return the animal's name.
   * 
   * @see org.com1027.animal.Animal#getName()
   */
  @Override
  public String getName() {
    return super.getName() + " is my duck name";
  }
}
