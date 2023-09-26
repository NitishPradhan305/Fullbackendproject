package ComparableandComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(3, "Kite", 78));
		list.add(new Employee(5, "John", 28));
		list.add(new Employee(7, "Peter", 23));
		list.add(new Employee(2, "Carl", 21));

		Collections.sort(list, new NameComparator());
		list.forEach(System.out::println);
		
		System.out.println("------------");
		
		Collections.sort(list, new AgeComparator());
		list.forEach(System.out::println);
	}

}
