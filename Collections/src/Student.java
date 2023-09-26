
public class Student {
private String name;
private int rollno;
private String address;
private int standerd;

public Student() {
	super();
}

public Student(String name, int rollno, String address, int standerd) {
	super();
	this.name = name;
	this.rollno = rollno;
	this.address = address;
	this.standerd = standerd;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getStanderd() {
	return standerd;
}

public void setStanderd(int standerd) {
	this.standerd = standerd;
}

@Override
public String toString() {
	return "Student [name=" + name + ", rollno=" + rollno + ", address=" + address + ", standerd=" + standerd + "]";
}

}
