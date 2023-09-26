package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class LambdaExpressionforfiltering {
	
	public static void main(String[] args) {
		ArrayList<Employee> em = new ArrayList<>();
		em.add(new Employee(1,"Nitish",26));
		em.add(new Employee(2,"suraj",25));
		em.add(new Employee(4,"Husan",46));
		em.add(new Employee(6,"Bihari",20));
		em.add(new Employee(3,"Lalsingh",19));
		
		List<Employee> list = em.stream().filter((e)->e.getAge()>25).collect(Collectors.toList());
		list.forEach((n)->System.out.println(n));
		
		System.out.println("---------------");
		
		List<String> list2 = em.stream().filter((a)->a.age<25).map(b->b.name).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		System.out.println("---------------");
		em.stream().filter(a->a.id>3).forEach(pro->System.out.println(pro.name));
		
		//Summing all the ages
		System.out.println("---------------");
		Integer sum = em.stream().collect(Collectors.summingInt(k->k.age));
		System.out.println(sum);
		
		//max method to get max age
		System.out.println("------------");
		Employee employee = em.stream().max((a,b)->a.age>b.age?1:-1).get();
		System.out.println(employee);
		
		//min method to get the minimum age
		System.out.println("----------");
		Employee employee2 = em.stream().min((a,b)->a.age>b.age?1:-1).get();
		System.out.println(employee2);
		
		System.out.println("----------------------");
		//Converting list to set
		Set<Employee> set = em.stream().collect(Collectors.toSet());
		set.forEach(System.out::println);
		
		//Converting to map from list
		System.out.println("-------------");
	    Map<Integer, String> map = em.stream().collect(Collectors.toMap(p->p.id,k->k.name));
	    System.out.println(map);
	    
	   
	}

}
