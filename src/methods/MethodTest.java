package methods;

public class MethodTest {
	
	public static void main(String[] args) {
		
		//sum();
		//printTable(7658);
		int x = getSumOf1to100();
		System.out.println("Sum of 100 nums = "+x);
		
		int sv = findSmallestValue(766567, 8765467);
		System.out.println(sv);
	}
	
	//1. no return type with no arguments
	static void sum() {
		
		int x =876;
		int y = 43567;
		
		int s = x + y;
		System.out.println("Total = "+s);
	}
	
	//2. no return type with arguments
	static void  printTable(int n) {
		
		  for(int i=1; i<=10; i++) {
			  System.out.println(n+" x "+i+" = "+(n*i));
		  }
	}
	
   //3. return type with no arguments
	static int getSumOf1to100() {
		
		  int s = 0;
		  for(int i=1; i<=100; i++) {
			  s = s + i;
		  }
		  return s;
	}
	
	//4. return type with arguments
	static int findSmallestValue(int a, int b) {
		
		    if(a < b) {
		    	return a;
		    }
		    
		    return b;
	}

	 /*
	  * Q> Find  area and volume as :
	  * 
	  *     a>  getArea :
	  *         -> pass l and b  as parameter
	  *         -> calculate area
	  *         -> return area
	  *         -> call getArea in main method
	  *         
	  *     b> volume :
	  *         -> pass area and height as parameter
	  *         -> calculate volume
	  *         -> print area
	  *         -> print volume
	  *         -> call this method in main.
	  *         
	  *   Q> Find SI and Amount as :
	  *   
	  *       a> input
	  *       b> processing
	  *       c> output
	  */
	
}




