package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReverseorderList {

	public static void main(String[] args) {
		ArrayList<String> name  = new ArrayList<>();
		name.add("Anjali");
		name.add("John");
		name.add("Janny");
		name.add("Hello");
		
		Collections.sort(name,Comparator.reverseOrder());
		name.forEach(System.out::println);
		
	}

}
