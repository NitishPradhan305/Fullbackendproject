package Classes.lambdas;

interface Nitish{
	void dance(String name);
}

public class TwoParametersLambda {
	
   public static void main(String[] args) {
	        Nitish n = (a)->{
	        	System.out.println("Your name is :- "+a);
	        };
	        n.dance("Mike");
   }
}
