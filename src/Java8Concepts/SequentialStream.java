package Java8Concepts;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.DoubleStream;

//Intermediate óperations:-Filter,Sort,Map :- return a stream so that we can chain multiple intermediate operations
//Zero or more intermediate operations are allowed.
//anyMatch ,//Distinct // filter//findFirst()//flatmap//map//skip//sorted

//Terminal Operations:-forEach,Collect,reduce are either void or return a non stream result
public class SequentialStream {
	//BaseStream is superclass .Its subclasses are intstream,Doublestream,Longstream
	//intstream ->Sequence of primitive int value elements
	public static void main(String[] args) {
		//1.
		Stream<String> stream =Stream.of("Shobhit","Tom","Sam","Sunny");
		//stream.forEach(System.out::println); //Stream closed 
		stream.findFirst().ifPresent(x->System.out.println(x));
		
		//2.
		Arrays.asList("ä1","a2","a3")
		.stream().
		findFirst().
		ifPresent(x->System.out.println(x));
		
		//3.Range 1 to 5
		IntStream.range(0,5).forEach(System.out::println);
		
		//4
		Arrays.stream(new int[] {1,2,3,4,5,6,7,8})
		.map(n->n*2).average().ifPresent(z->System.out.println(z));
		
     	//5 String data objects
		Stream.of("ä1","a11","a11","a111")
		.map(s->s.substring(1))
		.mapToInt(Integer::parseInt)
		.max()
		.ifPresent(System.out::println);
		
		//6 Double to String Objects
		Stream.of(1.0,2.0,3.0)
		.mapToInt(Double::intValue)
		.mapToObj(i->"a"+i).forEach(System.out::println);
	
		//7.  
		Stream.iterate(0,n->n+1).limit(10).forEach(System.out::println);
		
		//8
		Stream.iterate(0, i->i+1).filter(n->n%2!=0).limit(10).forEach(System.out::println);
	
	
	}

}