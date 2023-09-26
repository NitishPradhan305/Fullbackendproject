package com.premitivetypefunctionalinterface;

import java.util.function.IntSupplier;


/*@FunctionalInterface
public interface IntSupplier {

   
    int getAsInt();
}*/
public class SupplierPremivitiveEx {

	public static void main(String[] args) {
		
		IntSupplier intsup=()-> (int)(Math.random() *10);
		String otp="";
		for(int i=0;i<=4;i++)
		{
			otp=otp+intsup.getAsInt();
		}
		System.out.println(otp);
		}
	}

