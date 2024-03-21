package StringConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AccuranceArray {

	public static void main(String[] args) {

		String value = "Manojkumar";

		Map<Character, Integer> mp = new HashMap<>();

		for (int i = value.length() - 1; i >= 0; i--) {

			if (mp.containsKey(value.charAt(i))) {

				int count = mp.get(value.charAt(i));

				mp.put(value.charAt(i), ++count);

			} else {

				mp.put(value.charAt(i), 1);

			}

		}

		System.out.println(mp);

	}

}
