package Classes;



public class LambdaExampleforMultithreading {

	public static void main(String[] args) {
		Runnable r1 = new Runnable(){
			public void run() {
				System.out.println("running the thread");
			}
		};
  
		Thread ti = new Thread(r1);
		ti.start();
		
		Runnable r2 = ()->System.out.println("Nitish you are using lambda expression");
		Thread t2 = new Thread(r2);
		t2.start();
		
		
	}

}
