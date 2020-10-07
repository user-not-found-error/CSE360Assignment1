package cse360assignment02;

/**
 * This is a class that can doing things
 * like add or subtract a value to the current total, 
 * get the current total, print the history that how 
 * to get that total, and clear the total.
 * @author Zuoan He
 *
 */
public class AddingMachine {
	private int total;
	private String history = "0";
	
	/**
	 * Set the initial total to 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	 
	 /**
	  * Return the current total.
	  * @return
	  */
	 public int getTotal () {
		 return total;
	 }
	 
	 /**
	  * Add a input value to the total.
	  * @param value
	  */
	 public void add (int value) {
		 total += value;
		 history = history + " + " + value;
	 }

	 /**
	  * Subtract a input value from the total.
	  * @param value
	  */
	 public void subtract (int value) {
		 total -= value;
		 history = history + " - " + value;
	 }

	 /**
	  * Return the history that how to get the total.
	  */
	 public String toString () {
		 return history;
	 }

	 /**
	  * Clear total and history.
	  */
	 public void clear() {
		 total = 0;
		 history = "0";
	 }
}
