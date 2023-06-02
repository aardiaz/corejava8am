package controlstatements.selection;

public class LadderTest {
	
	/*
	 *  =========== else if ==============
	 *    syntax :
	 *    
	 *       if(condition-1){
	 *       
	 *       }
	 *       else if(condition-2){
	 *       
	 *       }
	 *       ............
	 *       ................
	 *       ................
	 *       .........
	 *       else{
	 *       
	 *       }
	 *       
	 */
	
	public static void main(String[] args) {
		
		  int age = 18;
		  
		  if(age >= 70) {
			  System.out.println("old age..do rest");
		  }
		  
		  else if(age >= 45) {
			  System.out.println(" adult... do less work ");
		  }
		  
		  else if(age >= 30) {
			  System.out.println("Youg.... do more work ....");
		  }
		  
		  else if(age >= 20) {
			  System.out.println("Bachelor.....do party....");
		  }
		
		  else if(age >= 13) {
			  System.out.println("Teenager.....do study");
		  }
		  
		  else {
			  System.out.println("child..... just enjoy....");
		  }
		  
		  
	}

}
