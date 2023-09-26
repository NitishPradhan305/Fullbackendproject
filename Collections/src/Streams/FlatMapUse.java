package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapUse {

	public static void main(String[] args) {
		List<Integer> evenNum = Arrays.asList(2,4,6,8);
		List<Integer> oddNum = Arrays.asList(3,7,9,11,13,15);
		List<Integer> primeNum = Arrays.asList(2,3,5,7,11,13,17);
		
		List<List<Integer>> listOflist = Arrays.asList(evenNum,oddNum,primeNum);
		System.out.println("Before using flatMap means before flatenning :- ");
		System.out.println(listOflist);
		System.out.println("-------------------");
		List<Integer> listofStream = listOflist.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		System.out.println(listofStream);
	}

}
