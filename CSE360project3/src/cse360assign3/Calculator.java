
package cse360assign3;

/**
 * Class which can be used to perform arithmetic operations and maintains a running total.
 * 
 * @author Matthew Stockford PIN 819 for CSE360 Spring 2016
 * 
 */
public class Calculator {

	private int total;
	private String history;


	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "" + total;
	}
	
	/**
	 * getTotal- returns the correct value of the calculation
	 * @return the correct total of the calculation
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add- adds the value to the current total
	 * @param value the value to be added to the total
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * subtract- subtracts the value from the current total
	 * @param value the value to subtract from the total
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * multiply- multiples the total by the given value 
	 * @param value the value by which to multiply the total
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/**
	 * divide- divides the total by the given value
	 * @param value the value by which to divide the total
	 */
	public void divide (int value) {
		if(value == 0){
			total = 0;
		}
		else{
			total = total / value;
		}
		
		history = history + " / " + value;
	}
	
	/**
	 * getHistory- returns a history of all actions
	 * @return a string representation of action history
	 */
	public String getHistory () {
		return history;
	}
}
