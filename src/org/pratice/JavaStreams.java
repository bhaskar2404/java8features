package org.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {
	public void streamsEamples() {
		Stream stream=Stream.of("One","Two","three","Four","Five");
		stream.forEach(name->System.out.println(name));
		
		Stream streamInt=Stream.of(1,2,3,4,5,6,7,8,9,10);
		streamInt.forEach((num)->System.out.println(num));
		
		//List
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.stream().forEach(n->System.out.println("list num"+n));
		
		Stream<Integer> randomNumbers = Stream
			      .generate(() -> (new Random()).nextInt(100));
		randomNumbers.limit(20).forEach(System.out::println);

	}
	
	public void streamCollectors() {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> even=list.stream().filter(num->num%2==0).collect(Collectors.toList());
				System.out.println(even);
				
				//Printing the values using arrays
				
	Integer[] nums=list.stream().filter(x->x%2!=0).toArray(Integer[]::new);		

	Stream.of(nums).forEach(System.out::print);
	}
	
	public void  StreamOperation() {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Bhaskar");
		memberNames.add("Geetha Vani");
		memberNames.add("thanusri");
		memberNames.add("Josritha");
		memberNames.add("Likithasai");
		memberNames.add("Sahithisai");
		memberNames.add("Nageswararao");
		memberNames.add("Vanam");
		
		// Find the names start with V
	memberNames.stream().filter(name->name.startsWith("V")).forEach(System.out::println);	
	
	memberNames.stream().filter(name->name.contains("sri") && name.contains("tha")).forEach(System.out::println);	
	
	memberNames.stream().filter(name->name.startsWith("V")).map(x->x+"Great").forEach(System.out::println);	
	
	}
	
	public static void main(String a[]) {
		JavaStreams jstreams=new JavaStreams();
	
		jstreams.StreamOperation();
		
		
		 // Count the empty strings
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long count = strList.stream()
                            .filter(x -> x.isEmpty())
                            .count();
        System.out.printf("List %s has %d empty strings %n", strList, count);
 
        // Count String with length more than 3
        long num = strList.stream()
                           .filter(x -> x.length()> 3)
                           .count();
        System.out.printf("List %s has %d strings of length more than 3 %n", 
                            strList, num);
 
 
        // Count number of String which startswith "a"
        count = strList.stream()
                       .filter(x -> x.startsWith("a"))
                       .count();
        System.out.printf("List %s has %d strings which startsWith 'a' %n",
                               strList, count);
 
        // Remove all empty Strings from List
        List<String> filtered = strList.stream()
                                       .filter(x -> !x.isEmpty())
                                       .collect(Collectors.toList());
        System.out.printf("Original List : %s, List without Empty Strings : %s %n",
                                       strList, filtered);
 
        // Create a List with String more than 2 characters
        filtered = strList.stream()
                          .filter(x -> x.length()> 2)
                          .collect(Collectors.toList());
        System.out.printf("Original List : %s, filtered list : %s %n",
                                  strList, filtered);
 
 
        // Convert String to Uppercase and join them using coma
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy",
                                           "U.K.","Canada");
        String G7Countries = G7.stream()
                               .map(x -> x.toUpperCase())
                               .collect(Collectors.joining(", "));
        System.out.println(G7Countries);
 
        // Create List of square of all distinct numbers
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream()
                                         .map( i -> i*i).distinct()
                                         .collect(Collectors.toList());
        System.out.printf("Original List : %s,  Square Without duplicates : %s %n",
                                          numbers, distinct);
 
        //Get count, min, max, sum, and average for numbers
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream()
                                           .mapToInt((x) -> x)
                                           .summaryStatistics();
        System.out.println("Highest prime number in List : " + stats.getMax());
        System.out.println("Lowest prime number in List : " + stats.getMin());
        System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());
		

	
		
			}

}
