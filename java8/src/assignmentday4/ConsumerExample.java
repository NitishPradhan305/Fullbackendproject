package assignmentday4;

import java.util.ArrayList;
import java.util.function.Consumer;

class Customer {
	private int id;
	private String firstname;
	private String address;
	private String role;

	public int getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getAddress() {
		return address;
	}

	public String getRole() {
		return role;
	}

	public Customer(int id, String firstname, String address, String role) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.address = address;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", address=" + address + ", role=" + role + "]";
	}

}

public class ConsumerExample {

	public static void m1() {
		
	}
	public static void main(String[] args) {
		Consumer<Customer> con = (cust) -> System.out.println(cust.getFirstname());
		
		Consumer<Customer> con2 = con.andThen(cust->{
			System.out.println(cust.getId());
			System.out.println(cust.getAddress());
			System.out.println(cust.getRole());
		});
		
		ArrayList<Customer> custom = new ArrayList<Customer>();
		custom.add(new Customer(1,"Nitish","hyd","developer"));
		custom.add(new Customer(2,"Suraj","Mumbai","developer"));
		custom.add(new Customer(3,"Manish","Chennai","tester"));
		custom.add(new Customer(4,"Rahul","Delhi","Operator"));
		
		System.out.println("All Details of emplyee are as follows:-");
		
		for(Customer cus : custom) {
			con2.accept(cus);
		}
	}

}
