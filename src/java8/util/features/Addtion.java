package java8.util.features;

@FunctionalInterface
public interface Addtion {
	
	
	public int sum(int x,int y);
	default void dispalyName(String x) {
		System.out.println(x);
	}
}
