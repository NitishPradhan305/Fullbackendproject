package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaEightCompartor {
    public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Nitish",26));
		list.add(new Employee(2,"suraj",25));
		list.add(new Employee(4,"Husan",46));
		list.add(new Employee(6,"Bihari",20));
		list.add(new Employee(3,"Lalsingh",19));
		
		// 1st way using java 8 for sorting based on the name of the employee objects
		List<Employee> orderedList = list.stream().sorted(new NameComparator()).collect(Collectors.toList());
		Iterator<Employee> itr = orderedList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// 2nd way of using the java 8 for sorting the objects based on the age of the objects
		System.out.println("-----------------------");
		Comparator<Employee> comparator = Comparator.comparing(Employee::getAge);
		Collections.sort(list, comparator);
		list.forEach(System.out::println);
		
		// sorting based on the id
		System.out.println("--------------");
		Comparator<Employee> cmp = Comparator.comparing(Employee::getId);
		Collections.sort(list, cmp);
		list.forEach(System.out::println);
		
		
	}
}
