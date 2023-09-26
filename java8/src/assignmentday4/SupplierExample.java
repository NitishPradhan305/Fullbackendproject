package assignmentday4;

import java.util.Iterator;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		
		Supplier<String> supply =()->{
			String[] pass= new String[8];
			String pass1="";
			Random r= new Random();
			for(int i=0;i<8;i++) {
				if(i%2==0) {
					pass[i]=pass1+(int)(Math.random()*8);
				}
				else {
					char ra = (char) (r.nextInt(26) + 'A');
					pass[i]=pass1+ra;
				}
			pass1=pass[i];
			}
			return pass1;
		};

		System.out.println("Your Password is :-");
		System.out.println(supply.get());
	}

}
