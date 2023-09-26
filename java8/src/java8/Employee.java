package java8;

import java.util.HashMap;
import java.util.Map;

public class Employee {

	int id;
	String name;
	String address;
	int salary;
	public Employee(int id, String name, String address, int salary) {    
	    this.id = id;    
	    this.name = name;    
	    this.address = address;    
	    this.salary=salary;
	}    
	 public static void main(String[] args) {
		
		Employee obj1=new Employee(101,"Nitish","CKP",200);
		Employee obj2= new Employee(101,"Nitish","CKP",200);
		HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();    
		   map.put(1,obj1);   
		   map.put(2,obj2);   
		   
	    System.out.println("Iterating Hashmap...");  
	    for(Map.Entry m : map.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
	}
}
