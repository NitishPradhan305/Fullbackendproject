package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import enitities.Product;

public class MethodReferenceinStream {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product(1, "Book", 560));
		list.add(new Product(2, "Bat", 1000));
		list.add(new Product(3, "Colgate", 56));
		list.add(new Product(4, "Shirt", 1000));
		list.add(new Product(5, "Bananas", 60));
		
		List<Integer> collect = list.stream().map(Product::getPrice).collect(Collectors.toList());
		System.out.println(collect);

	}

}
