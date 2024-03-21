package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task {

	public void listt() {

		List li = new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);

		System.out.println(li);

		Object object = li.get(1);

		System.out.println(object);

		Object set = li.set(2, 90);
		System.out.println(li);

		li.add(2, 87);
		System.out.println(li);
		
		
		
		

	}

	public static void main(String[] args) {

		Task task = new Task();

		task.listt();

	}

}
