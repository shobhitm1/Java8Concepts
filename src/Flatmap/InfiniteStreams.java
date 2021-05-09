package Flatmap;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args) {
	//Infinite stream :-generates infinite streams of data
	
	//1.Iterate()
		//static( seed, UnaryOperator<T> F)
		//returns a stream -->stream<T>
		
		List coll=IntStream.iterate(0, n -> n+2).mapToObj(Integer::valueOf)
		.limit(10)
		.collect(Collectors.toList());
		
		System.out.println(coll);
		
	//2.Generate()
		//static generate(Supplier<T> s)
		//random->100
		
		List col2=Stream.generate(()->(new Random()).nextInt(100))
		.limit(10)
		.collect(Collectors.toList());
		
		System.out.println(col2);
		

	}

}
