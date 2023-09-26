package com.premitivetypefunctionalinterface;

import java.util.function.IntPredicate;

/*public interface IntPredicate {

    boolean test(int value);
}*/
public class PremitivePredicateEx {
	
	public static void main(String[] args) {
		
		
		
		int x[]= {12,7,6,8,10,43,32};
		IntPredicate pre=i->(i%2)==0;
		
		for(int x1 :x)
		{
			if(pre.test(x1))
			System.out.println(x1);
		}
		
	}

}
