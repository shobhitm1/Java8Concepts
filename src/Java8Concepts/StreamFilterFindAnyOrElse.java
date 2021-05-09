package Java8Concepts;

import java.util.Arrays;
import java.util.List;

public class StreamFilterFindAnyOrElse {

	public static void main(String[] args) {
		
		//List of customer objects
		List<Customer> cust = Arrays.asList(
				new Customer("John",20),
				new Customer("Sam",21),
				new Customer("Angel",22),
				new Customer("Sam",24)
				);
		//filter with did not find any the provide null
		Customer customer = cust.stream().filter((x)->"John".equals(x.getName())).findAny().orElse(null);
		System.out.println(customer.getAge()+" "+customer.getName());
		System.out.println(customer);
		//Filter with Multiple conditions
		Customer customer2 =cust.stream().filter((y)->"Sam".equals(y.getName()) && 21 ==y.getAge()).findAny().orElse(null);
		System.out.println("-------");
		System.out.println(customer2.getName()+" "+customer2.getAge());
	}

}
