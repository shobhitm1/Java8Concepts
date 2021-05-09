package Flatmap;

import java.util.Arrays;	
//we can't apply intermediate operations on streams of data,so wee need flatmap method for it.
//Stream flatMap(Function mapper) returns a stream consisting of the results of replacing each element of this stream with the contents of 
//a mapped stream produced by applying the provided mapping function to each element.
import java.util.stream.Stream;

public class StreamStringArraywithFlatMap {
 
	public static void main(String[] args) {
		//Stream->Flatmap->Filter
		String data[][] = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		Stream<String[]> dataStream = Arrays.stream(data);
		// appply flatmap on datastream
		Stream<String> streamFlatMap = dataStream.flatMap(x -> Arrays.stream(x));
		Stream<String> streamFilter = streamFlatMap.filter(x -> "a".equals(x.toString()));
		streamFilter.forEach(System.out::println);
		Stream<String> finalstream = Arrays.stream(data)
				 .flatMap(x -> Arrays.stream(x))
				 .filter(x -> "c".equals(x.toString()));
		finalstream.forEach(System.out::println);
		
	}
}
