package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparator {
    public static void main(String[] args) {
		ArrayList<Employee> em = new ArrayList<>();
		em.add(new Employee(1,"Nitish",26));
		em.add(new Employee(2,"suraj",25));
		em.add(new Employee(4,"Husan",46));
		em.add(new Employee(6,"Bihari",20));
		em.add(new Employee(3,"Lalsingh",19));
		
		Collections.sort(em, new AgeComparator());
		Iterator<Employee> itr = em.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------------------------");
		Collections.sort(em,new NameComparator());
		Iterator<Employee> tr = em.iterator();
		while(tr.hasNext()) {
			System.out.println(tr.next());
		}
	}
}
