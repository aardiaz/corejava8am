package controlstatements.selection;

public class IFElseTest {
	/*
	 *  ======================= if-else ======================
	 *  syntax :
	 *    if(condition){
	 *    
	 *         //statements
	 *    }else{
	 *    
	 *       //statements
	 *    }
	 */
	
	public static void main(String[] args) {
		
		 int n = 5678;
		 
		  if(n%2 == 0) {
			  System.out.println(n + " is even  number");
		  }else {
			  System.out.println(n+" is odd number");
		  }
		  
	}
}
