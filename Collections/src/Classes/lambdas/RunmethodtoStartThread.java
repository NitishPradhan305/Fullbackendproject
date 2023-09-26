package Classes.lambdas;

public class RunmethodtoStartThread {

	public static void main(String[] args) {
		Runnable r1 = new Runnable(){
			public void run() {
				System.out.println("Run method is called");
			}
		};
       Thread t1 = new Thread(r1);
       t1.start();
       
       Runnable r2 = new Runnable(){
    	   public void run() {
    		   System.out.println("Why you are you running");
    	   }
       };
       Thread t2 = new Thread(r2);
       t2.start();
	}

}
