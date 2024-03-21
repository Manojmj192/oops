package StringConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class accurance {

	public static void main(String[] args) {

		Map<Character, Integer> m = new HashMap<>();

		String value = "ManojManoj";

		for (int i = 0; i <= value.length() - 1; i++) {

			char charAt = value.charAt(i);

			if (m.containsKey(charAt)) {

				int count = m.get(charAt);
				m.put(charAt, count + 1);

			} else {

				m.put(charAt, 1);

			}
			
			

		}
		
		

	}

}
