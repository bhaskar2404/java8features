package java8.util.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class java8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> even=new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer num) {
				if(num%2==0)
					return true;
				return false;
			}
		};
		
		System.out.println(even.test(20));
		
		Addtion a=(x,y)->x+y;
		
		int x=a.sum(40,10);
		
		a.dispalyName("Hello");
		
		System.out.println(x);
		
		Predicate<String> str=(t)->t.contains("hello");
		
		System.out.println("String Predicate: "+str.test("hello world"));
		
		Predicate<String> str1=(t)->t.length()>5;
		
		System.out.println("String Predicate Length more than 5: "+str1.test("abc"));
		
		List<Student> studentList=new ArrayList<Student>();
		
		Student s=new Student("Vanam", "Bhaskar", 35, "Male");
		
		studentList.add(s);
		studentList.add(new Student("Vanam", "Bhaskar", 35, "Male"));
		studentList.add(new Student("Vanam", "Bhaskar", 40, "Male"));
		studentList.add(new Student("Aravala", "Prasanna", 35, "female"));
		studentList.add(new Student("Aravala", "Chandra", 40, "Male"));
		studentList.add(new Student("Vanam", "Josritha", 30, "female"));
		studentList.add(new Student("Pamidi", "geetha", 35, "female"));
		studentList.add(new Student("Vanam", "Sahithi", 20, "Female"));
		
		studentList.stream().filter(x1->x1.getAge()>30).forEach(System.out::println);
	//	studentList.stream().filter(s->s.getFirstName().endsWith("Aravala"))
		
	List<Student>	sorted=studentList.stream().sorted((s1,s2)->s.getAge()-s2.getAge()).collect(Collectors.toList());
	
		
	
		
	}
	
	
	

}
