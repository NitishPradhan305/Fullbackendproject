package assignmentday5;

import java.util.ArrayList;
import java.util.Comparator;

class Employee3{
	int id;
	String name;
	int age;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Employee3(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee3 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
public class StreamEx3 {

	public static void main(String[] args) {
		
		ArrayList<Employee3> arr= new ArrayList<Employee3>();
		arr.add(new Employee3(1,"Nitish",23));
		arr.add(new Employee3(2, "Rahul", 34));
		arr.add(new Employee3(3, "Krishna", 45));
		arr.add(new Employee3(4, "Haris", 65));

		Comparator<Employee3> comparator = Comparator.comparing( Employee3::getAge );
		Employee3 emp=arr.stream().max(comparator).get();
		System.out.println(emp);
	}

}
