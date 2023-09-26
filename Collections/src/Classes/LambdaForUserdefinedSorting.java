package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person implements Comparator<Person>{
	int id;
	String name;
	int age;
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compare(Person o1, Person o2) {
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		return p1.name.compareTo(p2.name);
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}

public class LambdaForUserdefinedSorting {
	
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person(1,"Nitish",26));
		list.add(new Person(2,"suraj",25));
		list.add(new Person(4,"John",46));
		list.add(new Person(6,"Mike",20));
		list.add(new Person(3,"Janny",19));
		
     Collections.sort(list,(a,b)->{
    	 return a.name.compareTo(b.name);
     });
     
     for (Person person : list) {
		System.out.println(person);
	}
	}
}
