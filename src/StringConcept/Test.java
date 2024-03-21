package StringConcept;

import java.util.Iterator;

public class Test {

	static String Value = "level";
	static String Rev = "";

	public static void main(String[] args) {

		for (int i = Value.length() - 1; i >= 0; i--) {

			char charAt = Value.charAt(i);

			System.out.print(charAt);

			Rev = Rev + charAt;

		}

		System.out.println(Rev);

		if (Rev.equalsIgnoreCase(Value)) {

			System.out.println("Its a palindrome");

		} else {

			System.out.println("Not a palindrome");

		}

	}

}
