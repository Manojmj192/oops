package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class keyvalue {

	public static void cds() {

		Map<String, String> m = new HashMap<>();

		m.put("FristName", "Manoj");
		m.put("LastName", "MJ");
		m.put("Age", "26");
		m.put("location", "Chennai");
//		m.put("FristName", "ABC");

		System.out.println(m);

		Set<Entry<String, String>> entrySet = m.entrySet();

		System.out.println(entrySet);

		for (Map.Entry<String, String> en : entrySet) {

			String key = en.getKey();
			String value = en.getValue();

		}

	}

	public static void main(String[] args) {

		cds();

	}

}
