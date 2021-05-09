 package Java8Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMap {
	//The map() is used to transform one object into other by applying a function.
	public static void main(String[] args) {
		 List<Customer> cust = Arrays.asList(
				new Customer("John",20),
				new Customer("Sam",21),
				new Customer("Angel",22),
				new Customer("Sam",24)
				);
		//Stream map(Function mapper) returns a stream consisting of the results of applying the given function to the elements of this stream.
		//map method is used to map with different object. 
	//String s= cust.stream().filter(x->"John".contentEquals(x.getName()).map(Customer::getName()).findAny();
	//System.out.println(s);
	
	List<Integer>customList =cust.stream().map(Customer::getAge).collect(Collectors.toList());
	System.out.println(customList);
	}

}
