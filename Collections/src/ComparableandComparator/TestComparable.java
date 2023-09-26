package ComparableandComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
 
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, 12, "Nitish","GOA"));
		list.add(new Student(2, 34, "Mike", "Ckp"));
		list.add(new Student(3,15, "Hero", "Pune"));
		list.add(new Student(4, 16, "Carl", "London"));
		
		Collections.sort(list);
		list.forEach(System.out::println);
	}
}
