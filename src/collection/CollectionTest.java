package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
	public static void main(String[] args) {
		
		List<Integer>  list = Arrays.asList(9,8,7,65,4,56,7,89,34,3,43,54,67);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.fill(list, 8000);
		System.out.println(list);
		
	}

}
