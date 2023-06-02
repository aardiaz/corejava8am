package collection;

import java.util.Arrays;
import java.util.List;

public class ListTest2 {
	
	public static void main(String[] args) {
		
		List<Integer>   list= List.of(98,7,65,43,256,7,89,7,657,86); 
		list.forEach( data -> System.out.println(data));
		
		  Arrays.asList("aa","dfdf","eee","tttt").forEach(d -> System.out.println(d));
	}

	
}
