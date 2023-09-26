package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.TreeSet;

public class ListIteratorUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Employee> em = new ArrayList<>();
        em.add(new Employee(1,"Nitish",26));
		em.add(new Employee(2,"suraj",25));
		em.add(new Employee(4,"Husan",46));
		em.add(new Employee(6,"Bihari",20));
		em.add(new Employee(3,"Lalsingh",19));
		
	 ListIterator<Employee> li = em.listIterator(em.size());
	 while(li.hasPrevious()) {
		 Employee emp = li.previous();
		 System.out.println(emp);
	 }
	 
	 System.out.println("---------------------------");
	 Collections.sort(em, (a,b)->{
		 if(a.age<b.age) {
			 return 1;
		 }else if(a.age>b.age) {
			 return -1;
		 }else {
			 return 0;
		 }
	 });
	 em.forEach((x)->System.out.println(x));
	}

}
