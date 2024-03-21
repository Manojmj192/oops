package StringConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringBasis {

	static String name = "my name is manoj";

	public static void stringg() {

		String value = "Manoj";

		int length = value.length();

		System.out.println(length);

		String substring = value.substring(1, 4);
		System.out.println(substring);

		String substring2 = value.substring(2);
		System.out.println(substring2);

		char charAt = value.charAt(1);
		System.out.println(charAt);

	}

	public static void split() {

		String[] split = name.split(" ");

//		for (String c : split) {
//
//			System.out.println(c);
//
		
		for(int i=0;i<split.length;i++) {
			
			System.out.println(split[i]);
			
			
			
		}
		
	
			
			
			
//		}

	}

	public static void main(String[] args) {

		stringg();
		split();

	}

}
