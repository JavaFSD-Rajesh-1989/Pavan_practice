package basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class S1 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,35,34,3546345,34563468,345,2345);
		
		Stream<Integer> data = list.stream();
		long count = data.count();
		System.out.println(count);
		data.forEach(val -> System.out.println(val));
		
		
		
	}

}
