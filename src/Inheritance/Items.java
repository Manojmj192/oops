package Inheritance;

public class Items extends Hotel{

	public boolean Info(String j) {

		String[] b = { "DOSA-20", "Idly-10", "Pongal-30", "Chappathi-40" };

		
		
		for (String d : b) {
			String[] one = d.split("-");	

			if (one[0].equalsIgnoreCase(j)) {

				System.out.println(one[0]);
				System.out.println(one[1]);

				return true;

			}

		}
		return false;

	}

	public static void main(String[] args) {

		Items o = new Items();
		o.Info("Dosa");

	}

}
