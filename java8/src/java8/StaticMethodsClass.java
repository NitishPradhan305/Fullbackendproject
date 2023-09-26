package java8;

import java.util.function.Predicate;

interface staticEx{
	public static void run() {
		System.out.println("Implementation class static methods");
	}
}
public class StaticMethodsClass {

	public static void main(String[] args) {
		
		staticEx.run();
		
 
	}

}
