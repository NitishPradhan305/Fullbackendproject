package Classes.functionalinterfacces.consumers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class UseOfConsumer {

	public static void main(String[] args) {
		Consumer<List<Integer>> modify = list->{
			for (int i = 0; i < list.size(); i++) {
				list.set(i,list.get(i)*4);
			}
		};
		
		Consumer<List<Integer>> display = list->{
			list.stream().forEach(System.out::println);
		};

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(9);
		arr.add(7);
		arr.add(8);
		arr.add(3);
		arr.add(2);
		
		modify.andThen(display).accept(arr);
	}

}
