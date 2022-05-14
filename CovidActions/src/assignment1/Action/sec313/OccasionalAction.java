package assignment1.Action.sec313;

/**
 * This class is for occasional actions (subClass of Action)that only happens in
 * the 3rd and the 15th of each month.
 * 
 * @author Mohamed Elsheikh
 * @version Created on Mar 07, 2022
 */

// YOUR CODE STARTS HERE!!!

public class OccasionalAction extends Action {
	private int day;

	/**
	 * @param d   for discreption
	 * @param day for day
	 */
	public OccasionalAction(String d, int day) {
		super(d);
		this.day = day;
	}

	/**
	 * Overrides the abstract method from the superClass.
	 * 
	 * @return True if user input matches any criteria.
	 */
	@Override
	public boolean occursOn(int year, int month, int day) {
		
		if (this.day == day ) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param d for descreption from super class Action.
	 */

	

}