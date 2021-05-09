package Java8Concepts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarInstance {
	//constructor never returns values
	//Constructor is called at the time of creation the object.
	//Parametrized constructor //
	//super refers to the parent class 
	//super.variable //super()
	//super constructor should be the first line of child constructor.
	//This refers to the current class object.Class object lies in class level
	//All static variables are class variables.Remaining variables are instance variables.
	//Static variables shares it's copy with all of the objects.
	//Static method will only allow static variable
	//static block has all of the variables as static.
	public static void main(String[] args) {
		Calendar car = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(car.getTime()));
		System.out.println(car.get(Calendar.DAY_OF_WEEK));
		System.out.println(car.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(car.get(Calendar.DAY_OF_YEAR));
		System.out.println(car.get(Calendar.AM_PM));
		System.out.println(car.get(Calendar.MINUTE));
		
		Date d = new Date();
		SimpleDateFormat sdfg = new SimpleDateFormat("M/d/yyyy");
		System.out.println(d.toString());
		System.out.println(sdfg.format(d));
	}

}
