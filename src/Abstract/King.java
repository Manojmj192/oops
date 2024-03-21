package Abstract;

public class King implements MethodCheck {
	
	
	
	
	public static void main(String[] args) {
		
		MethodCheck check = new King();
		check.create();
		
		
		
	}

	@Override
	public void create() {
		
		System.out.println("hi this is interface");
		
		
	}
	
	
	
	
	

}
