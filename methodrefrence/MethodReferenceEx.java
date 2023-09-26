package com.methodrefrence;

interface Printable
{
	public void print();
}
public class MethodReferenceEx {

	public static void m1()
	{
		System.out.println("This  method inside in the class");
	}
	public  void m2()
	{
		System.out.println("2nd method");
	}
	public static void main(String[] args) {
		
		//Using Lambda Expression
		Printable p=()->System.out.println("hello");
		
		
		//by Using Method Refrence
		
		Printable p1=MethodReferenceEx::m1;
		p1.print();
		
		Printable p2=MethodReferenceEx::new;
		p2.print();
		
	}
}
