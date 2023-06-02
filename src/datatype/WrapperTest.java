package datatype;

import java.math.BigDecimal;
import java.math.BigInteger;

public class WrapperTest {
	/*
	 *  ====================== Wrapper Class =====================
	 *  # every primitive data type has respective class 
	 *    is known as wrapper class.
	 *    
	 *    Primitive type     Wrapper Class
	 *    --------------     --------------
	 *    byte 					Byte
	 *    short					Short
	 *    int					Integer
	 *    long					Long
	 *    float					Float
	 *    double				Double
	 *    char					Character
	 *    boolean 				Boolean
	 *    
	 */
	
	public static void main(String[] args) {
		
		//'x' is int variable only//primitive type
		int x = 700;
		  
		//'k' is int variable and object also //wrapper type
		Integer k = 500;
		
		
		//===================== auto-boxing =============================
		/*
		 *    conversion of primitive type in to wrapper type.
		 */
		
		int p = 3456;
		Integer m = p; // auto-boxing
		 
		//====================== auto-unboxing ===========================
		// conversion of wrapper type into primitive type.
		
//		Double h = 345643.45654345;
//		double l = h; // auto-unboxing
//		
//		int r = 60000;
//		System.out.println(Integer.toBinaryString(r));
//		System.out.println(Integer.toOctalString(r));
//		System.out.println(Integer.toHexString(r));
		
		//======================= Big numbers ===================
		/*
		 *   1>  BigInteger
		 *   2>  BigDecimal
		 */
		BigInteger a1 = BigInteger.valueOf(Integer.MAX_VALUE);
		BigInteger b1 = BigInteger.valueOf(Integer.MAX_VALUE);
		
	   BigInteger c = a1.add(b1);
	   System.out.println(c);
	   
	   BigDecimal  bd = BigDecimal.valueOf(Double.MAX_VALUE).add(BigDecimal.valueOf(Double.MAX_VALUE));
	   System.out.println(bd);
		
	   
	}

}
