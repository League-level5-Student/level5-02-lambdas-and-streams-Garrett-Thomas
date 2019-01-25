package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			String temp = "";
			for (int i = s.length() - 1; i > -1; i--) {
				temp = temp + s.charAt(i);
			}
			for (int i = 0; i < 10; i++) {
				System.out.println(temp);
			}
		}, "num");
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			String temp = "";
			for (int i = 0; i < s.length(); i++) {
				if (i % 2 == 0) {
					temp = temp + s.charAt(i) + "".toLowerCase();
				} else {
					temp = temp + s.charAt(i) + "".toUpperCase();
				}
			}
			for (int i = 0; i < 10; i++) {
				System.out.println(temp);
			}
		}, "ang");
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			String temp = "";
			for (int i = 0; i < s.length(); i++) {
					temp = temp + s.charAt(i) + ".";
				}
			for (int i = 0; i < 10; i++) {
				System.out.println(temp);
			}
		}, "goyard");
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "Lucas");
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
