package Java8Concepts;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept {

	public static void main(String[] args) {
	//Sequential stream takes only single core
	//Parallel stream runs in multiple streams. //ForJoinPool
		//CommonPool // tells how many cores are in the system
		//Use parallelstram when the order does not matter
		ForkJoinPool core = ForkJoinPool.commonPool() ;
		System.out.println(core.getParallelism());
		
		// Paralle() on  a stream
		Stream stream =Stream.of("Shobhit","Mahesh","Suresh","Anand","Andrew");
		Stream.of("Shobhit","Mahesh","Suresh","Anand","Andrew").forEach(System.out::println);
		System.out.println("------");
		Stream.of("Shobhit","Mahesh","Suresh","Anand","Andrew").parallel().forEach(System.out::println);
		System.out.println("------");
		//2 .Use ParallelStream method at a collector 
		Arrays.asList("Shobhit","Mahesh","Suresh","Anand","Andrew").parallelStream().forEach(System.out::println);
		System.out.println("------");
		//3.Range method
		IntStream.rangeClosed(0, 10).forEach(System.out::println);
		System.out.println("------");
		IntStream.rangeClosed(0, 10).parallel().forEach(System.out::println);
		//Print in Alaphabetical order
		//System.out.println(getArrayList());
		getArrayList().stream().forEach(System.out::println);
		getArrayList().parallelStream().forEach(System.out::println);
		//Check stream is running in Parallel Mode :-isParallel() Method is there
		IntStream s1=IntStream.rangeClosed(1,10);
		System.out.println(s1.isParallel()); // to check whether stream is running paralllel or not
		IntStream s2=IntStream.rangeClosed(1,10);s2.parallel();
		System.out.println(s2.isParallel());
	}
		
		public static ArrayList<String> getArrayList(){
			java.util.ArrayList<String> alpha =new ArrayList<String>();
			int n=97;
			while(n<=122) {
				char c =(char)n;
				alpha.add(String.valueOf(c));
				n++;
			}
			return alpha;
		}
}
