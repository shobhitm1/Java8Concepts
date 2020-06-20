package Java8Concepts;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerInterfaceConcept {

	public static void main(String[] args) {
		/*
		 * Represents an operation that accepts a single input argument and returns no
		 * result. Unlike most other functional interfaces, Consumer is expected to
		 * operate via side-effects.
		 //It has one abstract method :- accept
		 */
		
		Consumer<String> func = x->System.out.println(x);
		func.accept("Automation");
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(1);aList.add(2);	
		aList.add(20);aList.add(7);aList.add(9);aList.add(0);aList.add(17);
		aList.forEach(x->System.out.println(x));		
		
		
	}

}
