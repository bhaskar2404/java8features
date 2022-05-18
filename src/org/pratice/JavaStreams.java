package org.pratice;

import java.util.ArrayList;
import java.util.Arrays;
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
			}

}
