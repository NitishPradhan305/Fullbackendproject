package Classes;

public class Student implements Comparable<Student> {
	
	int id;
	String name;
	int age;
	String occupation;
	
	
	public Student() {
		super();
	}
	
	
	public Student(int id, String name, int age, String occupation) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.occupation = occupation;
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
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", occupation=" + occupation + "]";
	}



	@Override
	public int compareTo(Student o) {
		if(age==o.age) {
			return 0;
		}else if(age<o.age) {
			return 1;
		}else
		return -1;
	}
	
	
}
