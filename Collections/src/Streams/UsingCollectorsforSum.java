package Streams;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

import enitities.Product;

public class UsingCollectorsforSum {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product(1, "Book", 560));
		list.add(new Product(2, "Bat", 1000));
		list.add(new Product(3, "Colgate", 56));
		list.add(new Product(4, "Shirt", 1000));
		list.add(new Product(5, "Bananas", 60));

		IntSummaryStatistics collect = list.stream().collect(Collectors.summarizingInt(product -> product.getPrice()));
		System.out.println(collect.getSum());
		System.out.println(collect.getMax());
		System.out.println(collect.getAverage());
		System.out.println(collect.getCount());
	}

}
