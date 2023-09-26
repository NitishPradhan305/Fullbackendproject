package Classes.lambdas;

interface Addition{
	int add(int a,int b, int c);
}

public class Addtwonumbers {

	public static void main(String[] args) {
		Addition a = (k,l,m)->{
			return (k+l+m);
		};
		
		System.out.println(a.add(78,34,67));
	}

}
