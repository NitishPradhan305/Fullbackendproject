package com.premitivetypefunctionalinterface;

import java.util.function.ObjDoubleConsumer;

/*@FunctionalInterface
public interface ObjDoubleConsumer<T> {

       void accept(T t, double value);
}*/
class Employee
{
	String name;
	double salary;
	Employee(String name,double salary)
	{
		 this.name=name;
		 this.salary=salary;
		 
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}
public class BiConsumerEx {

	public static void main(String[] args) {
		
		ObjDoubleConsumer<Employee> bicprem=(emp,d)-> emp.salary=emp.salary+d;
		Employee emp=new Employee("ABC",90000.0d);
		bicprem.accept(emp , 8000.75d);
		System.out.println(emp);
	}
}
