package com.premitivetypefunctionalinterface;

import java.util.function.DoublePredicate;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class PreitiveFunction {

	public static void main(String[] args) {
		
		//Function<T,R> fun;
		
		IntFunction<Integer> intFun= i -> i*i;
		System.out.println(intFun.apply(6));
		
		ToIntFunction<String> fun= s->s.length();
		System.out.println(fun.applyAsInt("Bhawana"));
		
		IntToDoubleFunction fun2= i -> Math.sqrt(i);
		System.out.println(fun2.applyAsDouble(8));
		}

}
