package Flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapwithFlatMap {

	public static void main(String[] args) {
	
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.setName("Shobhit");
		emp1.addDevices("Asus Zenfone");emp1.addDevices("Dell");emp1.addDevices("Samsung");emp1.addDevices("Apple");
		emp2.setName("Akshay");
		emp2.addDevices("Lenovo");emp2.addDevices("HP");emp2.addDevices("Mac");emp2.addDevices("Apple");
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(emp1);emp.add(emp2);
		
		List<String> deviceList=emp.stream()
		.map(x->x.getDevices())//Stream<Set<String>>
		.flatMap(x->x.stream()) 
		.distinct() //Stream<String>
		.collect(Collectors.toList());
		
	deviceList.forEach(z->System.out.println(z));
		
	}

}
