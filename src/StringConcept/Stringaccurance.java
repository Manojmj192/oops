package StringConcept;

public class Stringaccurance {

	public static void main(String[] args) {

		String name = "manojmanojmanoj";

		String value = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			char charAt = name.charAt(i);

			value = value + charAt;

		}
		System.out.println(value);

		if (name.equals(value)) {
			
			System.out.println("Its a palindrome");
			
		}else {
			
			System.out.println("Not a palindrome");
			
			
		}
		
		
	}


	
	
	
}
