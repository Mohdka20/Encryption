/*Assignment 02
CST8116 Introduction to Computer Programming

Student name: Mohamed Elsheikh
Lab Section: 341
Date: Nov, 20th ,2021
Lab Professor: Dave Houtman
*/

import java.util.Scanner;

//ToDo: Supervisor wants programmer comments (use /* */ comment)
public class User {

	private Scanner keyboard = new Scanner(System.in);

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public int inputInteger() {
		boolean isInputBad = true;
		boolean hasNextInt;
		int value = 0;
		while (isInputBad) {
			hasNextInt = keyboard.hasNextInt();
			if (hasNextInt) {
				value = keyboard.nextInt();
				isInputBad = false; // break out of loop
			} else {
				System.out.print("Invalid input. Enter an integer number: ");
			}
			keyboard.nextLine(); // clean up input stream
		}
		return value;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public int inputInteger(String message) {
		// This method calls inputInteger(), so no changes are needed here.
		System.out.printf("%s", message);
		int value = inputInteger();
		return value;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public double inputDouble() {
		boolean isInputBad = true;
		boolean hasNextDouble;
		double value = 0.0;
		while (isInputBad) {
			hasNextDouble = keyboard.hasNextDouble();
			if (hasNextDouble) {
				value = keyboard.nextDouble();
				if (value >= 0) {
					isInputBad = false; // break out of loop
				}
			} else {
				System.out.print("Invalid input. Enter a number: ");
			}
			keyboard.nextLine(); // clean up input stream
		}
		return value;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public double inputDouble(String message) {
		// This method calls inputDouble(), so no changes are needed here.
		System.out.printf("%s", message);
		double value = inputDouble();
		return value;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public String inputString() {
		String value = keyboard.nextLine();
		return value;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public String inputString(String message) {
		System.out.printf("%s", message);
		String value = inputString();
		return value;
	}

}