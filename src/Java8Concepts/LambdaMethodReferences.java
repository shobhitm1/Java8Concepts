package Java8Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaMethodReferences {
 //foreach mehthod is a method of Iterable interface.
	public static void main(String[] args) {
	
		List<String> alist = Arrays.asList("Shobhit","Sunil","Shikhar","Shekhar");
		//Anonymous class
		alist.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
			
		});
		System.out.println("-----");
		//2.Using Lambda Expression
		alist.forEach(
				str->System.out.println(str)
				);
		
		System.out.println("-----");
		//3.Method Reference
		//Method reference is used to refer method of functional interface
		alist.forEach(System.out :: println);
	}

}
