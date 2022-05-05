package org.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class JavaStreams {
	
	public static void main(String a[]) {
	
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

}
