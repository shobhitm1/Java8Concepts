package Java8Concepts;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class StreamFilterCollect {

	public static void main(String[] args) {
		// A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
		//Stream can be created through any collection object 
		//Stream->Filter(take predicate interfacei.e. boolean)->sort->map->collect
		//A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.

		List<String> aList = Arrays.asList("Apple","Samsung","Nokia","Asus");
		aList.forEach(ele->System.out.println(ele));
		System.out.println("*****");
		List<String> phone =aList.stream().filter(elem->!elem.contentEquals("Apple")).collect(Collectors.toList());
		System.out.println(phone);
		//aList.forEach(System.out::println);
		
	}

}
