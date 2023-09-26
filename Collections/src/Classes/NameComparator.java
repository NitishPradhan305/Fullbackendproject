package Classes;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		Employee e = (Employee)e1;
        Employee f = (Employee)e2;
		return e.name.compareTo(f.name);
	}

}
