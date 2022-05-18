import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Converting the String to uppercase and printing the values
		
		 List<String> stringList = Arrays.asList("John", "Martin", "Mary", "Steve");
		 
	        stringList.stream()
	                   .map((s) -> s.toUpperCase())
	                   .forEach(System.out::println);
	        
	        Stream<Integer> intStream =Stream.iterate(100,n->n+1).limit(20);  
	        intStream .forEach(System.out::println);
	        
	        
	        Stream<Integer> strGen=Stream.generate(()->1).limit(10);
	        
	        strGen.forEach(System.out::println);
	}

}
