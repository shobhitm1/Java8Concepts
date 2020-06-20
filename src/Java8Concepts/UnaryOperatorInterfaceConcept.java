package Java8Concepts;

import java.awt.List;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		/*
		 * //UnaryOprator Interface extends FunctionInterface Represents an operation on
		 * a single operand that produces a result of the same type as its operand. This
		 * is a specialization of Function for the case where the operand and result are
		 * of the same type.
		 */
	UnaryOperator<Integer> fun =x->x*7;
	int a =fun.apply(8);	
	System.out.println(a);
	
	//Function
	Function<Integer,Integer> func = y->y*10;
	int b =func.apply(5);
	System.out.println(b);
	
	ArrayList<String> lst =new ArrayList();
	lst.add("Ruby");lst.add("Selenium");lst.add("Java");
	System.out.println(lst);
	lst.replaceAll(arg -> arg+"Shobhit");
	System.out.println(lst);
	}
}
