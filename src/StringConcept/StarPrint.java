package StringConcept;

public class StarPrint {

	public static void main(String[] args) {

		int row = 6;
//		
//		
//		for(int i=0; i<row;i++) {
//			
//			for(int j=0;j<i;j++) {
//				
//				
//				System.out.print("*");
//				
//			}
//			System.out.println();
//			
//			
//		}

		for (int i = row; i >= 0; i--) {

			for (int j = i; j >= 0; j--) {

				System.out.print("*");

			}
			
			System.out.println();
			

		}

	}

}
