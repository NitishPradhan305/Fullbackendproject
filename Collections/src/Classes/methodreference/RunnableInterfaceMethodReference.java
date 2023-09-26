package Classes.methodreference;


public class RunnableInterfaceMethodReference {
	
    public static void laugh() {
    	System.out.println("You have used method reference in threading concept.");
    }

	public static void main(String[] args) {
       Runnable r = RunnableInterfaceMethodReference::laugh;
       Thread t1 = new Thread(r);
       t1.start();
	}

}
