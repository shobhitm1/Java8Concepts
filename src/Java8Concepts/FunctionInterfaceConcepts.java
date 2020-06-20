package Java8Concepts;

import java.util.function.Function;

public class FunctionInterfaceConcepts {

	public static void main(String[] args) {
		/*
		 * Interface Function<T,R> Type Parameters: T - the type of the input to the
		 * function R - the type of the result of the function
		 *It has one abstract method i.e. apply
		 */
		Function<String,Integer> func =x->x.length();
		int length= func.apply("Java 8 Conepts");System.out.println(length);
		
		Function<Integer,Integer> func2=x->x*2;
		int len= func.andThen(func2).apply("Shobhit this side");System.out.println(len);
	}

}
