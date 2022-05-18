package java8.util.features;

import java.util.Arrays;
import java.util.List;

public class ListRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list=Arrays.asList(1,2,3,4,5,6,7,3,4);
		list.stream().distinct().sorted().forEach(System.out::println);
	}

}
