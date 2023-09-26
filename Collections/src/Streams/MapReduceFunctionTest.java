package Streams;

import java.util.ArrayList;
import java.util.Optional;

public class MapReduceFunctionTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(6);
		list.add(3);
		list.add(2);
		list.add(9);
		
		Optional<Integer> reduce = list.stream().reduce((num1,num2)->num1+num2);
		System.out.println(reduce.get());
		}

}
