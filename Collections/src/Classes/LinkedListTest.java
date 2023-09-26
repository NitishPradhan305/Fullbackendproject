package Classes;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> lnk = new LinkedList<>();
		lnk.add("Nitish");
		lnk.add("Laike");
		lnk.add("suraj");
		lnk.add("Zero");
		lnk.add("Jabse");
		lnk.add("John");
		lnk.add("Nitish");
		Iterator<String> itr = lnk.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
