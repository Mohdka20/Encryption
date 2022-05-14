
public class Exercise06 {

	public static void main(String[] args) {
		final int ENCODE = 1;
		final int DECODE = 2;
		final int EXIT = 0;
		int option = 0;
		String userText = "";
		String formatString = "%d %s%n";
		SimpleCipher cipher = new SimpleCipher();
		User user = new User();
		do {
			System.out.printf(formatString, ENCODE, 
					"to encode text");
			System.out.printf(formatString, DECODE,
					"to decode text");
			System.out.printf(formatString, EXIT,
					"to exit program");
			option = user.inputInteger("Enter option: ");
			switch(option) {
			case ENCODE:
				userText = user.inputString("Enter text to encode ");
				userText = cipher.encode(userText);
				System.out.printf("result:%n%s%n", userText);
				break;
			case DECODE:
				userText = user.inputString("Enter text to decode ");
				userText = cipher.decode(userText);
				System.out.printf("result:%n%s%n", userText);
				break;
			case EXIT:
				System.out.printf("%s%n", "Program will exit now.");
				break;
			default:
				System.out.printf("%s%n", "Invalid Option.");
				break;
			}
		} while(option != 0);
		System.out.println("Program by Mohamed Elsheikh");
	}
}
