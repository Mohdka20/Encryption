package assignment1.Action.sec313;
import java.lang.reflect.*;
/**
 * This Class to test OccasionalAction Class, it will check if 
 * its a child of Action and check if it has its own field.
 * @author Mohamed Elsheikh
 * @version Created on Mar 07, 2022
 */

public class ActionDriver {

	public static void main(String[] args) {
		Class ActionClass = Action.class;
		Class RegularClass = RegularAction.class;

		RegularAction act1 = new RegularAction("RegularAction is just a subclass of Action: ");
		RegularAction act2 = new RegularAction("Wash your hands ");
		/**
		 * Check if RegularAction is a subclass of Action
		 */
		boolean inheritCheck;
		if (RegularClass.getSuperclass() == ActionClass) {
			inheritCheck = true;
		} else {
			inheritCheck = false;
		}
		/**
		 * Check if RegularAction has no fields but the inherited from superclass
		 */
		boolean fieldscheck = false;
		Field[] fields = RegularClass.getDeclaredFields();

		if (fields.length == 0) {
			fieldscheck = true;
		} else {
			fieldscheck = false;
		}

		System.out.print(act1);
		System.out.println(inheritCheck);
		System.out.println("Expected :true");
		System.out.println("RegularAction activities have no extra fields: " + fieldscheck);
		System.out.println("Expected :true");
		System.out.println("Looking at regular actions: " + act2.toString());
		System.out.println("Expected: Wash your hands");
		System.out.println(act2.occursOn(0, 0, 0));
		System.out.println("Expected :true");

	}

}
