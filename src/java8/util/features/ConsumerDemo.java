package java8.util.features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer con=(Str)->System.out.println("Welcome to Bankof America");
		
		con.accept(100);
		
	/*	Consumer conNum=(x)->System.out.println(x);
		
		conNum.accept(100);*/
		
		List<Integer> num=new ArrayList();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
		num.add(70);
//		
//		Consumer<List> con1=(num1)->{
//		
//			for(int i=0;i<num1.size();i++)
//				System.out.println(num1.get(i));
//		};
//		
//		
//		con1.accept(num);
		

		num.forEach(x->System.out.println(x));
		
		
		
		
		 System.out.println("Read Specific Enviornment Variable");
	        System.out.println("JAVA_HOME Value:- " + System.getenv("JAVA_HOME"));
	 
	        System.out.println("\nRead All Variables:-\n");
	 
	        Map <String, String> map = System.getenv();
	        
	       // map.forEach((key,value)->System.out.println("Variable Name:- " + key + " Value:- " + value));
	        for (Map.Entry <String, String> entry: map.entrySet()) {
            System.out.println("Variable Name:- " + entry.getKey() + " Value:- " + entry.getValue());
	        }
	 
		
		
	}

}
