package Java8Concepts;

import java.lang.management.MemoryUsage;

interface Calculator{
	void add(int num1,int num2);
}

interface Messenger{
	void getMessage(String msg);
}
class message{
	message(String msg){
		System.out.println("Message is "+ " "+msg);
	}
}
class calci{
	public static void add(int num1,int num2) {
		System.out.println("Sum of "+num1 +" and "+num2 +" is = "+(num1+num2));
	}
	
	public void addd(int num3,int num4) {
		System.out.println("Sum of "+num3 +" and "+num4 +" is = "+(num3+num4));
	}
}
public class MethodReferencesConcept {

	public static void main(String[] args) {
		calci.add(12, 14);
		//1.Refernce to Static Method
		Calculator Ref = calci::add;
		Ref.add(10, 19);
		//2.Refernce to non static Method
		calci cal = new calci ();
		Calculator refere = cal::addd;
		refere.add(13, 16);
		
		//3.Refernce to constructor
		Messenger mref = message::new;
		mref.getMessage("The message test");
	}

}
