package assignmentday5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name +"]";
	}

}

public class StreamEx2 {

	public static void main(String[] args) {
		ArrayList<Employee1> arr = new ArrayList<Employee1>();
		arr.add(new Employee1(1, "Nitish"));
		arr.add(new Employee1(2, "Sun"));
		arr.add(new Employee1(3, "Sun"));

		List<Employee1> lis=arr.stream().filter(emp->emp.getName().equals("Sun")).collect(Collectors.toList());
		System.out.println(lis);
	}

}
