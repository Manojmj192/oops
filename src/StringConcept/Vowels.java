package StringConcept;

public class Vowels {

	private void check() {

		String value = "I am the super one";

		String empty = "";

		String lowerCase = value.toLowerCase();

		for (int i = lowerCase.length() - 1; i >= 0; i--) {

			char charAt = lowerCase.charAt(i);

			if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u') {

				empty = empty + charAt;

			}

		}
		System.out.println(empty);

		

	}

	public static void main(String[] args) {

		Vowels v = new Vowels();
		v.check();

	}

}
