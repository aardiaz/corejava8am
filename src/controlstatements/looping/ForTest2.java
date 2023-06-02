package controlstatements.looping;

public class ForTest2 {
	
	public static void main(String[] args) {
		
		//print 1 to 100 and sum
		
		int es = 0;
		int os = 0;
		
		for(int i=1; i<=100; i++) {
			
//			System.out.println(i);
//			s += i;
			
			if(i%2==0) {
				es = es + i;
			}else {
				os = os + i;
			}
		}
		
		System.out.println("Sum of  even nos. = "+es);
		System.out.println("Sum of odd nos. = "+os);
		System.out.println("========================");
		System.out.println("\t  Total = "+(es+os));
		
	}

}
