package assignmentday5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class StreamEx1 {

	public static void main(String[] args) {

		ArrayList<Employee> arr = new ArrayList<Employee>();
		arr.add(new Employee(1, "Nitish", 18));
		arr.add(new Employee(2, "Rahul", 34));
		arr.add(new Employee(3, "Krishna", 45));
		arr.add(new Employee(4, "Haris", 65));

		List<Employee> lis = arr.stream().filter(emp -> emp.getAge() > 20).collect(Collectors.toList());
		System.out.println(lis);
	}

}
