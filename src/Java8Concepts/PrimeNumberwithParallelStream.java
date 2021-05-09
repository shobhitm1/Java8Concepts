package Java8Concepts;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class PrimeNumberwithParallelStream {

	public static void main(String[] args) {
	System.out.println(isPrime(13));
	long t1,t2; 
	t1=System.currentTimeMillis();
	long count =Stream.iterate(0, n->n+1).limit(500000).parallel()
			.filter(PrimeNumberwithParallelStream::isPrime)
			.peek(x->System.out.println(x))
			.count();
	System.out.println("Total Prime Numbers::"+count);
	t2=System.currentTimeMillis();
	System.out.println("Time Taken:- "+(t2-t1)/1000);
	//Time taken in parallel stream :- 7 
	//Time taken in sequential stream :- 23
	}
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		else {
			return !IntStream.rangeClosed(2, num/2).anyMatch(n->num%n==0);
		}
	}
}
