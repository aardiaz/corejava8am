package array;

import java.util.Arrays;

public class ArrayWithMethod {

	/*
	 * ================ Array With Method ================= a> array as parameter :
	 * //50 values
	 * 
	 * void sum(int a[]){
	 * 
	 * }
	 * 
	 * b> array as return type :
	 * 
	 * int[] get20IntValues(){
	 * 
	 * return array; }
	 */

	public static void main(String[] args) {

		  int[] data = {9,8,7,65,4,56,78,34,56,4,35,2,34};
		 // addArray(data);
//		  addArray(new int[] {9,8,7,65,4,56,78,34,56,4,35,20,34});
//		  
//		  int[]   oddnos = getOddNumsFrom1to100();
//		  System.out.println(Arrays.toString(oddnos));
		  
		  System.out.println(Arrays.toString(getSubArrayOfEvenNos(data)));
		  
	}

	// ============ array as parameter =======================

	static void addArray(int values[]) {
		
		int s = 0;
		int sv = values[0];
		
		for (int x : values) {
			s += x;
			if(sv > x) {
				sv = x;
			}
		}
		System.out.println("Total = " + s);
       System.out.println("Smallest value = "+sv);
	}
	
	
	//===================== array as return type =======================
	
	  static int[]  getOddNumsFrom1to100() {
		  
		  int[]  oddnos = new int[50];
		  int j=0;
		  
		    for(int i=1; i<=100; i++) {
		    	
		    	if(i%2 != 0) {
		    		oddnos[j] = i;
		    		j++;
		    	}
		    }
		    
		  return oddnos;    
	  }
	

	 static int[]  getSubArrayOfEvenNos(int values[]) {
		  
		  //count even nums 
		     int size = 0;
		     for(int x : values) {
		    	 if(x%2 == 0) {
		    		 size++;
		    	 }
		     }
		     
		  //create array for even nums.
		  int[]  evns =   new int[size];
		     int i = 0;
			  for(int x : values) {
				  
				   if(x%2 == 0) {
					   evns[i] = x;
					   i++;
				   }
			  }
		  
		  return evns;
	  }
	  
	  
}




