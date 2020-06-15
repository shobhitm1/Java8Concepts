package Java8Concepts;

public class lambdaConcept {

	public static void main(String[] args) {
		//-> lambda expresssion
		//SAM :-Lambda expression allows only single abstract method.It is known as functional interface. 
		//Enable to treat functionality as a method argument, or code as data.
		//Lambda expressions basically express instances of functional interfaces 
		
		webpage w1 = (value)->System.out.println("hi"+" "+value);
		//w1.header("google");
		 //webpage w1 =(String value,int key)->System.out.println(value+" "+key);
		// w1.header("Shobhit",22);
		 w1.header("Shobhit");
	}
}
