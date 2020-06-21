package Java8Concepts;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {
		//Represents a predicate (boolean-valued function) of one argument.
		
		Predicate<Integer> func =x->x>5;
		ArrayList<Integer> aList = new ArrayList<Integer>(); 
		aList.add(1);aList.add(2);	
		aList.add(20);aList.add(7);aList.add(9);aList.add(0);aList.add(17);
		
		List<Integer>dlist= aList.stream().filter(func).collect(Collectors.toList());
		System.out.println(dlist);
		
		//Predicate with &&
		List<Integer>blist= aList.stream().filter(x->x>5 &&x<9).collect(Collectors.toList());
		System.out.println(blist);
		
		//Predicate with negate
		List<Integer>clist=aList.stream().filter(func.negate()).collect(Collectors.toList());
		System.out.println(clist);
		
	}

}
