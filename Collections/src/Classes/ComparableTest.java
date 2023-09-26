package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class ComparableTest {

	public static void main(String[] args) {
		ArrayList<Student> stu = new ArrayList<>();
		stu.add(new Student(1,"Nitish",26,"software"));
		stu.add(new Student(2,"Suraj",25,"Software"));
		stu.add(new Student(3,"Hello",34,"mechanical"));
		stu.add(new Student(8,"Laike",23,"teacher"));
		
		TreeSet<Student> tre = new TreeSet<>(stu);
	    tre.forEach(x->System.out.println(x));
		
	    System.out.println("------------------");
		Collections.sort(stu);
	    for (Student student : stu) {
			System.out.println(student);
		}
    
	}

}
