package java8.util.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeMain eMain=new EmployeeMain();
		
		List<Employee> empList=eMain.getListOfEmployees();
		List<String> empName=empList.stream().map(e->e.getName()).collect(Collectors.toList());
		System.out.println(empName);
		
		//to change to upper case
		
		List<String> empNameUpperCase=empList.stream().map(e->e.getName()).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(empNameUpperCase);
		
		List<String> empNameStartWithA=empList.stream().map(e->e.getName()).filter(s->s.startsWith("A")).collect(Collectors.toList());
		System.out.println(empNameStartWithA);
		
		List<Employee> empSorted=empList.stream().sorted().collect(Collectors.toList());
		System.out.println(empSorted);
		
		List<Employee> empSortedByAge=empList.stream().sorted((e1,e2)->e1.getAge()-e2.getAge()).collect(Collectors.toList());
		System.out.println(empSortedByAge);
		
		List<Employee> empByMetodRef=empList.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
			System.out.println(empByMetodRef);
		
	}
	
	public List<Employee> getListOfEmployees(){
		
		List<Employee> listOfEmployees = new ArrayList<>();
		
		
		Employee e1 = new Employee("Mohan", 24,Arrays.asList("Newyork","Banglore"));
		 Employee e2 = new Employee("John", 27,Arrays.asList("Paris","London"));
	        Employee e3 = new Employee("Vaibhav", 32,Arrays.asList("Pune","Seattle"));
	        Employee e4 = new Employee("Amit", 22,Arrays.asList("Chennai","Hyderabad"));
	        listOfEmployees.add(e1);
	        listOfEmployees.add(e2);
	        listOfEmployees.add(e3);
	        listOfEmployees.add(e4);
		return listOfEmployees;
	}

}
