package Flatmap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntArrayWithFlatMap {
	//Map:-it applies a function on each element of stream and stores the value returned by the function into a new Stream.
	//	/If map() uses a function, which, instead of returning a single value returns a Stream of values than you have a
	//Stream of Stream of values, and flatmap() is used to flat that into a Stream of values.
	//The function you pass to map() operation returns a single value.
	//The function you pass to flatMap() operation returns a Stream of value.
	//Before flattening - Stream of List of Integer
	//After flattening - Stream of Integer
	public static void main(String[] args) {

		//when you have stream array/stream li	st arra,stream int array you can't apply filter directly ,you will have to use 
		int data[]= {1,2,3,4,5,6,7,8};
		Stream<int[]>streamArray=Stream.of(data);
		IntStream intstream = streamArray.flatMapToInt(x->Arrays.stream(x));
		intstream.forEach(x->System.out.println(x));
		
		String a=null;
		boolean b="".equals(a);
		System.out.println(b);//in case of null it will return false.
		
	}

}
