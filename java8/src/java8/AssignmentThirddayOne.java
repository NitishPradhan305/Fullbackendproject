package java8;

import java.util.function.Predicate;

public class AssignmentThirddayOne {
	
	

	public static void main(String[] args) {
		
		String[] str = {"Yellow","Black"," ","Brown","Green",null,"Orange"," ","Blue"};
		
		
		Predicate<String> per = (ch1)->(ch1.charAt(0)=='b' || ch1.charAt(0)=='B');
		
		Predicate<String> per1 = ch1-> {
			if(ch1.equals(null) || ch1.equals("")){
				return false;
			}
			else
				return true;
		};

	
		
		System.out.println("The String without empty and null values are:-");
		m1(per1,str);
		
		System.out.println("The colours starting form B are as follows : -");
		m1(per,str);
	}

	private static void m1(Predicate<String> p, String[] colours) {
		for(String arr : colours) {
		if(p.test(arr)) {
			System.out.println(arr);
		}
		}
	}

}
