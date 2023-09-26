package java8streamparallel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestParallelStream {
	public static void main(String[] args) {



		long starttime = 0;
		long endtime = 0;



		/*
		* starttime=System.currentTimeMillis(); IntStream.range(1,
		* 100).forEach(System.out::println); endtime=System.currentTimeMillis();
		* System.out.println("Plain Stream time taken :"+(endtime-starttime));
		*/



		/*
		* starttime = System.currentTimeMillis(); IntStream.range(1,
		* 100).parallel().forEach(System.out::println); endtime =
		* System.currentTimeMillis(); System.out.println("Parallel Stream time taken :"
		* + (endtime - starttime));
		*/



		/*
		* IntStream.range(1, 20).forEach(x->{ System.out.println("Thread: "
		* +Thread.currentThread().getName()+ " : " + x); });
		*
		*
		* IntStream.range(1, 20).parallel().forEach(x->{ System.out.println("Thread: "
		* +Thread.currentThread().getName()+ " : " + x); });
		*/


		List<Employee> employee=new ArrayList<>();
		for(int i=1;i<=1000;i++)
		{
		employee.add(new Employee(1,"employee" ,"A",Double.valueOf(new Random().nextInt(1000*100))));

		}


		starttime=System.currentTimeMillis();
		employee.stream().map(Employee::getSalary).mapToDouble(i->i).average().
		getAsDouble(); endtime=System.currentTimeMillis();
		System.out.println("Plain Stream time taken :"+(endtime-starttime));



		starttime=System.currentTimeMillis();
		employee.parallelStream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
		endtime=System.currentTimeMillis();
		System.out.println("parallel Stream time taken :"+(endtime-starttime));
	}
}
