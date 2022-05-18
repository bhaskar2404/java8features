package java8.util.features;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> pre=new Predicate<Integer>() {

			public boolean test(Integer x) {
				if(x%2==0)
					return true;
					
				return false;
			}
			
		};

		System.out.println(pre.test(4));
		
		Predicate<Integer> pre1=(x)->x%2==0;
		System.out.println(!pre1.test(10));
	}

}
