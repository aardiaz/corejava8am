package array;

import java.util.Arrays;

public class SortTest {
	
	public static void main(String[] args) {
		
		int data[] = {4,5,6,78,9,98,76,5,67,87,6,545,6,7,89};
//		Arrays.sort(data);
//		
//		System.out.println(Arrays.toString(data));
//		
//		System.out.println("=========reverse order =============");
//		for(int i=data.length-1; i>=0; i--) {
//			System.out.print(data[i]+" ");
//		}
		
		Arrays.fill(data, 80);
		System.out.println(Arrays.toString(data));
		Arrays.fill(data, 5, 10, 55);
		System.out.println(Arrays.toString(data));
		
		System.out.println(Arrays.toString(Arrays.copyOf(data, 5)));
		System.out.println(Arrays.toString(Arrays.copyOfRange(data, 5,9)));
	}
}
