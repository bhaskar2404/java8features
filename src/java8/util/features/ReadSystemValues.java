package java8.util.features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReadSystemValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.out.println("\nRead All Variables:-\n");
			 
	        Map <String, String> map = System.getenv();
	        
	       // map.forEach((key,value)->System.out.println("Variable Name:- " + key + " Value:- " + value));
	      /*  for (Map.Entry <String, String> entry: map.entrySet()) {
          System.out.println("Variable Name:- " + entry.getKey() + " Value:- " + entry.getValue());
	        }*/
	 
	        
	        List<Integer> intList=new ArrayList<Integer>();
	        
	        intList.add(11);
	        intList.add(22);
	        intList.add(33);
	        intList.add(44);
	        intList.add(11);
	        intList.add(22);
	        intList.add(33);
	        intList.add(44);
	        intList.add(66);
	        intList.add(17);
	        
	        Set<Integer> set=intList.stream().map(x->x+5).collect(Collectors.toSet());
	        set.forEach(x->System.out.println(x));

	}

}
