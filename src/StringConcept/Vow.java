package StringConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Vow {

	public static void method() {

		String value = "i am a super star";

		String[] split = value.split(" ");

		for (String a : split) {

			System.out.println(a);

		}

	}

	public static void star() {

		String name = "manojkumarhero";
		int count = 0;

		Map<Character, Integer> mp = new HashMap<>();

		for (int i = 0; i <= name.length() - 1; i++) {

			char charAt = name.charAt(i);

			if (mp.containsKey(name.charAt(i))) {

				mp.put(name.charAt(i), ++count);

			} else {

				mp.put(name.charAt(i), 1);

			}

		}
		
		
		System.out.println(mp);

	}
	
	
	public static void stringvalue() {
		
		
		String v1 = "Manoj";
		String v2 = "Kumar";
		
		
		
		v1 = v1+v2;	
		
		
		v2 = v1.substring(0, (v1.length()-v2.length()));

		v1= v2.substring(v2.length());
		
		System.out.println(v1);
		System.out.println(v2);
		
	
		
		

	}
	
	
	
	
	public static void highest() {
		
		
		int[]	a = {10,40,20,50,80,70,50}	;
		
		
		
		System.out.println(a[1]);
		
		for(int z :a) {
			
			
		
			
			
		}
		
		
		
		
		
		

	}
	
	
	

	public static void main(String[] args) {

		method();

		star();
		stringvalue();
		highest();
		

	}

}
