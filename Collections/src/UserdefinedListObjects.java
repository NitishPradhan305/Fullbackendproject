import java.util.ArrayList;
import java.util.Iterator;

public class UserdefinedListObjects {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
	list.add(new Student("Nitish", 45, "Hyderabad", 7));
	list.add(new Student("Mike", 67, "Bangalore", 5));
	list.add(new Student("John", 23, "Delhi", 9));
	list.add(new Student("Jorge", 87, "Pune", 3));
	
	Iterator<Student> itr = list.iterator();
	while (itr.hasNext()) {
		Student student = itr.next();
		System.out.println(student.getRollno() + " " + student.getName());
	}

	}

}
