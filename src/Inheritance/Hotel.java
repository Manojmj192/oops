package Inheritance;

public class Hotel extends BIl{

	public boolean hotelInfo(String l) {

		String[] value = { "SVB-Nungambakkam-5Star", "Sangeetha-Annanager-4star", "RajBhavan-Kodambakkam-3star",
				"Seashell-adyar-2star" }

		;

		for (String s : value) {
//			System.out.println(s);
			String[] split = s.split("-");

			if (split[0].equalsIgnoreCase(l)) {
				System.out.println(split[0]);
				System.out.println(split[1]);
				System.out.println(split[2]);

				return true;
			}

		}
		return false;

	}

	public static void main(String[] args) {

		Hotel h = new Hotel();
		h.hotelInfo("sangeetha");
	}

}
