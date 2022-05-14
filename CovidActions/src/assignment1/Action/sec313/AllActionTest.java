package assignment1.Action.sec313;

import java.util.Arrays;
import java.util.Scanner;

/**
 * * This class will test all the Actions objects. will prompt the user 
 * to enter the date and then grab the result based on each objects condition.
 * @author Mohamed Elsheikh
 * @version Created on Mar 07, 2022
 */



public class AllActionTest {

/**
 * 
 * @param args main method
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * Array of actions objects
		 */
		Action[] ActionArray = new Action[4];
		ActionArray[0] = new RegularAction("Wash your Hands");
		ActionArray[1] = new RegularAction("Sit two meters apart");
		ActionArray[2] = new OccasionalAction("Take a PCR Test", 3);
		ActionArray[3] = new RareAction("Get a Booster Shot",3,12,2022);

		System.out.print("Enter a date in this format (2020 01 30) :");
		/**
		 * Array to iterate through user input to get the date in the expected format.
		 */

		int[] dateinput = new int[3];
		for (int i = 0; i <= 2; i++) {
			dateinput[i] = sc.nextInt();
		}
		System.out.printf("These are the actions on : " + "%s\n", Arrays.toString(dateinput).replaceAll("[\\[\\]]","").replaceAll(",", ""));

		/**
		 * Looping over the array of object to print the descreption if the object's
		 * date matches the user input dates
		 */
		
		for (Action act : ActionArray) {
			if (act.occursOn(dateinput[0], dateinput[1], dateinput[2]) == true) {
				System.out.println(act.toString());
			}	

		}
		}
}

		

		


