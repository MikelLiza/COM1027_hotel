/**
 * Mallard.java
 */

package org.com1027.animal;

/**
 * This class defines a generic mallard duck.
 * 
 * @author Stella Kazamia

 */
public class Mallard extends Duck {

	public Mallard() {
		this("No name");
	}
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName() + " is my mallard name";
	}


	/**
	 * Constructor requiring the animal's name.
	 * 
	 * @param name
	 *            the name of the animal.
	 */
	public Mallard(String name) {
		super(name);
		System.out.println("In Mallard constructor");

	}
}
