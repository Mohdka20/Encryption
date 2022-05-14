package assignment1.Action.sec313;
import java.lang.reflect.*;
/**
 * This class will check if the inhertence is properly implemented, 
 * using java reflect it will check if OccasionalAction and RareAction classes
 * are subclass of Action, also will check if both classes has its own fields.
 * @author Mohamed Elsheikh
 * @version Created on Mar 07, 2022
 */
public class ActionDriver2 {
/**
 * 
 * @param args Main method
 */
	public static void main(String[] args) {
		
		Class ActionClass = Action.class;
		Class OccationalClass = OccasionalAction.class;
		Class RareClass = RareAction.class;
/**
 * checking if OccasionalAcion is a subClass of Action
 */
		boolean inheritCheckOccasional;
			if (OccationalClass.getSuperclass() == ActionClass) {
			inheritCheckOccasional = true;
			} else {
			inheritCheckOccasional = false;
		}
/**
 * checking if RareAction is a subClass of Action		
 */
			
		boolean inheritCheckRare;
			if (RareClass.getSuperclass() == ActionClass) {
			inheritCheckRare = true;
			} else {
			inheritCheckRare = false;
		}
/**
 * 	Checking if OccasionalAction dont have extra uninherited fields	
 */
		boolean fieldscheckOccasional = false;
			Field[] fields = OccationalClass.getDeclaredFields();

			if (fields.length == 1) {
			fieldscheckOccasional = true;
			} else {
			fieldscheckOccasional = false;
		}
/**
 *  Checking if RareAction dont have extra uninherited fields		
*/
		boolean fieldscheckRare = false;
			Field[] fields1 = RareClass.getDeclaredFields();

			if (fields1.length == 3) {
			fieldscheckRare = true;
			} else {
			fieldscheckRare = false;
		}

		System.out.println("OccasionalAction is subclass of Action: " + inheritCheckOccasional);
		System.out.println("Expected :true");
		System.out.println("RareAction is subclass of Action: " + inheritCheckRare);
		System.out.println("Expected :true");
		System.out.println("OccasionalAction have no extra fields: " + fieldscheckOccasional);
		System.out.println("Expected :true");
		System.out.println("RareAction have no extra fields: " + (fields1.length == 3));
		System.out.println("Expected :true");

	}

}
