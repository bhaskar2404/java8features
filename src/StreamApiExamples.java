import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamApiExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Converting the String to uppercase and printing the values
		
		 List<String> stringList = Arrays.asList("Vanam", "Bhaskar", "Geetha", "Josritha");
		 
	        stringList.stream()
	                   .map((s) -> s.toUpperCase())
	                   .forEach(System.out::println);
	        
	        Stream<Integer> intStream =Stream.iterate(100,n->n+1).limit(20);  
	        intStream .forEach(System.out::println);
	        
	        
	        Stream<Integer> strGen=Stream.generate(()->1).limit(10);
	        
	        strGen.forEach(System.out::println);
	        
	        Stream<String> StrString=Stream.of("Bhaskar","Vanam","Thanusri","Josritha","Geetha");
	        Stream<String> nameStartWithSri  =StrString.map(String::toUpperCase).peek(s->System.out.println(s)).filter(s->s.contains("SRI"));
	       System.out.println(nameStartWithSri.count());
	       
	       
	       Stream<String> StrStringOrd=Stream.of("Bhaskar","Vanam","Thanusri","Josritha","Geetha");
	       
	       Stream<String> nameStartWithOrd=StrStringOrd.map((s)->{
	    	   System.out.println("Map :"+s);
	    	   return s.toLowerCase();
	       }).filter((s)->{
	    	   System.out.println("Filter:"+s);
	    	   return s.contains("sri");
	       });
	       
	       
	       Optional<String> findAny=nameStartWithOrd.findAny();
	       System.out.println(findAny);
	       
	       Stream.of("10","20","30","40").mapToInt(Integer::parseInt).average().ifPresent(System.out::println);
	}

}
