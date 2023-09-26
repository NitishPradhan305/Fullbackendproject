package java8;

import java.util.ArrayList;
import java.util.function.Function;

public class Employee1 {

	String firstname;
	int id;
	String address;

	public Employee1(String firstname, int id, String address) {
		super();
		this.firstname = firstname;
		this.id = id;
		this.address = address;
	}

	public String getFirstname() {
		return firstname;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee1 [firstname=" + firstname + ", id=" + id + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		Employee1 e = new Employee1("Nitish", 1, "Hyd");
		Employee1 e1 = new Employee1("Suraj", 2, "Mum");
		Employee1 e2 = new Employee1("Vicky", 3, "Tata");

		ArrayList<Employee1> arr = new ArrayList();
		arr.add(e);
		arr.add(e1);
		arr.add(e2);

		Function<Employee1, String> per = (emp) -> (emp.getFirstname());
		m1(per, arr);
	}

	private static void m1(Function<Employee1, String> p, ArrayList<Employee1> ar) {

		for (Employee1 em : ar) {
			System.out.println(p.apply(em));
		}

	}

}
