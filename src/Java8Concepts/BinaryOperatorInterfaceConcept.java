package Java8Concepts;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		/*
		 * Interface BinaryOperator<T> Type Parameters: T - the type of the operands and
		 * result of the operator All Superinterfaces: BiFunction<T,T,T> Functional
		 * Interface: This is a functional interface and can therefore be used as the
		 * assignment target for a lambda expression or method reference.
		 */
		/*
		 * Represents an operation upon two operands of the same type, producing a
		 * result of the same type as the operands. This is a specialization of
		 * BiFunction for the case where the operands and the result are all of the same
		 * type.
		 */
		BinaryOperator<Integer> func = (x1,x2)-> x1+x2;
		int res=func.apply(10, 20);
		System.out.println(res);
		
		//BiFunction Interface
		BiFunction<Integer,Integer,Integer> func2=(x1,x2) -> x1+x2;
		int ans= func.apply(12, 14);
		System.out.println(ans);
	}

}
