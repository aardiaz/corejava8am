package corejava;

import java.util.Scanner;

public class Add {
	
	public static void main(String[] args) {
		
		int a ;
		int b ;
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter value of a ");
		a = sc.nextInt();
		
		System.out.println("Enter value of b ");
		b = sc.nextInt();
		
		int s = a + b;
       System.out.println("Sum = "+s);
	}
	

}
