package Classes;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
	
	int id;
	String name;
	int age;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Employee() {
		super();
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


	@Override
	public int compare(Employee o1, Employee o2) {
		return 0;
	}


	
	
	

}