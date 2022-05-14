import java.io.CharArrayReader;

/*Exercise 06
 * CST8116 Introduction to Computer Programming
 *Student name: Mohamed Elsheikh
 *Lab Section: 341
 *Date: Dec, 2nd ,2021
 *Lab Professor: Dave Houtman
 */
/*
 * Cipher class will get the text from user and encode,decode and reverse 
 * the input
 */
public class SimpleCipher {

	/*
	 * this method will take the text from the user, reverse it using
	 *  method reverse and encode the message by incrementing by 2
	 */
	public String encode(String text) {
		 
		String result = "";
		//declare and setting the shift by value
		final int shiftBy = 2;
		// convert string into char array
		char[] original = text.toCharArray();
		// looping over the reversed array(using reverse method)
		//then adding the shiftBy value to each element, cast it to char 
		//and store in result 
		
		for (  char index : reverse(original)) {
		        result = result + (char) (index + shiftBy);
		}
		// return the resulting String.
		return result;
		}
	/*
	 * 	 * this method will take the text from the user, reverse it using
	 *  method reverse and decode the message by decrementing it by 2
	 */
	public String decode(String text) {
		
		String result = "";
		//declare and setting the shift by value
		final int shiftBy = 2;
		// convert string into char array
		char[] original = text.toCharArray();
		// looping over the reversed array(using reverse method)
		//then adding the shiftBy value to each element, cast it to char 
		//and store in result 
		for (char index : reverse(original)) {
			result = result +  (char) (index - shiftBy);
		}

		// return the resulting String.
		return result;
	}

	/*
	 * this method will reverse the text passed from encode method
	 *  and decode method.
	 */
	private char[] reverse(char[] original) {
		
		int length = original.length;
		char[] reversed = new char[length];
		int writeIndex = 0;
		
		for (int readIndex = length - 1; readIndex >= 0; readIndex--) {
			reversed[writeIndex] = original[readIndex];
			writeIndex++;
		}
		// the readIndex above starts at the last index, and stops at index zero
		// the writeIndex starts at zero, and stops at the last index.
		return reversed;
	}
}
