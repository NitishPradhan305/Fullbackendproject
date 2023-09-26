package Classes;


public class Employee2 implements Comparable<Employee2>{
 int id;
 String name;
 Integer age;
 
 
public Employee2(int id, String name, Integer age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}


@Override
public String toString() {
	return "Employee2 [id=" + id + ", name=" + name + ", age=" + age + "]";
}


@Override
public int compareTo(Employee2 e1) {
	// TODO Auto-generated method stub
	return age.compareTo(e1.age);
}
 
}
