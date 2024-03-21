package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapp {

	public static void main(String[] args) {

		Map<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("Manoj", 27);
		mp.put("Surya", 26);
		mp.put("Praveen", 24);
		mp.put("Prasanna", 22);

		System.out.println(mp);
		
		
		
		

//		 System.out.println(mp.entrySet());
		Set entrySet = mp.entrySet();
		System.out.println(entrySet);

		Iterator iterator = entrySet.iterator();

		while(iterator.hasNext()) {

			Object next = iterator.next();

			Map.Entry e = (Map.Entry) next;
			
			System.out.println("ENtyr" + e);

			Object key = e.getKey();
			System.out.println(key);
			Object value = e.getValue();
			System.out.println(value);

			if (value.equals(80)) {

				e.setValue(18);

			}
			
			if (key.equals("Manoj")) {
				
				
				
				
			}
			

		}

		System.out.println(entrySet);

	}

}
