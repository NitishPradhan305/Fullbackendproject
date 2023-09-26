package Classes.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import enitities.Animal;

public class LambdaComparator {

	public static void main(String[] args) {
		List<Animal> list = new ArrayList<>();
		list.add(new Animal(1,"Cat",23));
		list.add(new Animal(3,"Dog",12));
		list.add(new Animal(7,"Peacock",27));
		list.add(new Animal(7,"Frog",25));
		list.add(new Animal(9,"Mouse",5));
		
		Collections.sort(list, (a,b)->{
			return a.getName().compareTo(b.getName());
		});
   
		list.forEach(System.out::println);
		System.out.println("================================");
		
        //filtering data based on the age of the animal		
		list.stream().filter((a)->a.getA()>20).forEach(System.out::println);
		
	}

}
