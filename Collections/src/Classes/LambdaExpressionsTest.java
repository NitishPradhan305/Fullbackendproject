package Classes;

 interface Sound{
	public void laugh(String name);
}

  public  class LambdaExpressionsTest {
	public static void main(String[] args) {
    Sound s = (name)-> {
    	 System.out.println("Hello you have implemented java 8 "+name);
     };
     
     s.laugh("Nitish");
	}
}
