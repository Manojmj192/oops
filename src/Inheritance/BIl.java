package Inheritance;

public class BIl {

	public int gsT(int a) {

		int percentage = a * 18 / 100;

		System.out.println(percentage);

		return percentage;

	}

	public static void main(String[] args) {

		BIl h = new BIl();
		int gst = h.gsT(1000);

	}
	
	
	
	

}
