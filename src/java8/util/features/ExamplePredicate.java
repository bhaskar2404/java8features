package java8.util.features;

import java.util.function.Predicate;

public class ExamplePredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer num) {
		if(num>10)
		return true;
		return false;
	}

}
