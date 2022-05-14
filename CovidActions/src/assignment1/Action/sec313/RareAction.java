package assignment1.Action.sec313;
/**
 * In this file you will provide the code solution for Part 2. You are required
 * to create a subclass named RareAction. Activities for RareAction occurs on a
 * particular date of the year specified.
 * @author Mohamed Elsheikh
 * @version Created on Mar 07, 2022
 */

// YOUR CODE STARTS HERE!!!
public class RareAction extends Action {
	
private int day ;
private int month;
private int year;


/**
 * 
 * @param d for discreption 
 * @param m for month
 * @param day for day
 */
public RareAction(String d,  int month, int day, int year) {
	super(d);
	this.month = month;
	this.day = day;
	this.year = year;
	
}
	/**
	 * Overrides the abstract method from the superClass.
	 * @return True if it matches user input.
	 */
	@Override  
	public boolean occursOn(int year, int month, int day) {
		
		
		return (this.day == day && this.month == month  ) ;
		
	}
	
	

}
