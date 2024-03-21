package StringConcept;

public class StringReverse {

	public static void main(String[] args) {
		
		String a = "Manoj";
		String b= "Kumar";
		
		
		
		 a = a+b;
		 
		 
		  b = a.substring(0, a.length()-b.length());
		 
		 
		 
		 System.out.println(b);
		 
		 System.out.println("value " + b);
		 
		 a= a.substring(0, b.length());
		 System.out.println("valueb"+ a);
		 
		 
		
		
		
		
		
		
		
		
	}

}
