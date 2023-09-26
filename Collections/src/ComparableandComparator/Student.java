package ComparableandComparator;

public class Student implements Comparable<Student> {
	int id;
	int rollNo;
	String name;
	String address;

	public Student(int id, int rollNo, String name, String address) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	@Override
	public int compareTo(Student s1) {
		if (rollNo == s1.rollNo) {
			return 0;
		} else if (rollNo > s1.rollNo) {
			return -1;
		} else {
			return 1;
		}

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}

}
