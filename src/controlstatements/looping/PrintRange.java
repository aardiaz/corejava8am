package controlstatements.looping;

import java.util.Scanner;

public class PrintRange {
	
	public static void main(String[] args) {
		
		int sn;
		int en;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter start number ");
		sn= sc.nextInt();
		
		System.out.println("Enter end number ");
		en = sc.nextInt();
		
		for(int i = sn; i<=en; i++) {
			System.out.println(i);
		}
		
	}
	

}
