package controlstatements.looping;

public class EnhanceForTest {
	/*
	 * ============== Enhance For loop/forEach =================
	 * 
	 *   # use to read data from collection.
	 *    
	 *    syntax :
	 *    
	 *      for(data_type  var :  collection){
	 *           //statements
	 *      }
	 */
	
	public static void main(String[] args) {
		
		int  values[] = {8,7,76,5,43,45,6,78,97,65,46,78};
		int s = 0;
		
		for(int x : values) {
			System.out.println(x);
			s = s + x;
		}
		System.out.println("Total = "+s);
	}
	
}
