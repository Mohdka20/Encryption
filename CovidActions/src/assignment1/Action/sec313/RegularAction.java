package assignment1.Action.sec313;
/**
 * This class is subClass of Action for Regular actions that happens everyday.
 * @author Mohamed Elsheikh
 * @version Created on Mar 07, 2022
 */

//YOUR CODE STARTS HERE!!!!

public class RegularAction extends Action {
	/**
	 * 
	 * @param d for descreption from super class Action 
	 */
	public RegularAction(String d) {
		super(d);;

	}
	
	/**
	 * Overrides the abstract method from the superClass
	 * @return True "Actions to be done everyday".
	 */
	@Override
	public boolean occursOn(int year, int month , int day) {
		return true;
	}

	
	
	

}
