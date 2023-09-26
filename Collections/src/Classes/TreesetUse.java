package Classes;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetUse {

	public static void main(String[] args) {
      TreeSet<String> emp = new TreeSet<>();
      emp.add("Nitish");
      emp.add("Hello");
      emp.add("Suraj");
      emp.add("Micheal");
      emp.add("King");
      
      Iterator<String> iterator = emp.iterator();
      while(iterator.hasNext()) {
    	  System.out.println(iterator.next());
      }
      
      
      System.out.println("----------------------------------");
      Iterator<String> desc = emp.descendingIterator();	
      while(desc.hasNext()) {
    	  System.out.println(desc.next());
      }
	
	}
    
}
