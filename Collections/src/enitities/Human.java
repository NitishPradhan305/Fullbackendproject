package enitities;

public class Human {
	
	int id;
	String name;
	int age;
	
	
	public Human() {
		super();
	}


	public Human(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


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


	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	

}
