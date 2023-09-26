package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorNullFirst {
  public static void main(String[] args) {
	  ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Nitish",26));
		list.add(new Employee(2,"suraj",25));
		list.add(new Employee(4,"Husan",46));
		list.add(new Employee(6,"Bihari",20));
		list.add(new Employee(3,"Lalsingh",19));
		list.add(new Employee(8,"Killer",2));
		
		// null element should be the first priority and using Comparator.nullFirst we can do that
		Comparator<Employee> comp = Comparator.comparing(Employee::getName,Comparator.nullsFirst(String::compareTo));
		Collections.sort(list, comp);
		list.forEach(System.out::println);
		
		// null should be the last element using Comparator.nullsLast 
		System.out.println("---------------------");
		Comparator<Employee> com = Comparator.comparing(Employee::getName,Comparator.nullsLast(String::compareTo));
		Collections.sort(list, com);
		list.forEach(System.out::println);
		
		//reversing the order of the list using Comparator after sorting by their name 
		System.out.println("----------------------");
		List<Employee> col = list.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
	    col.forEach(System.out::println);
		
}
}
