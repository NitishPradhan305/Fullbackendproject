package java8;

import java.util.Iterator;

public class ThreadExAssign2day {


	public static void main(String[] args) {
		
		Thread r = new Thread(()->{
			for (int i=0 ;i<10;i++) {
				System.out.print(i);	
			}
		});
		
		r.start();
	}

}
