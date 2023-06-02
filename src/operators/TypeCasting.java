package operators;

public class TypeCasting {
	/*
	 * ================ Type casting =====================
	 * 
	 * syntax : data_type variable = (data_type) value;
	 * 
	 * a> implicit(auto casting) :
	 * 
	 * byte -> short -> int -> long -> float -> double
	 * 
	 * b> explicit(by force casting) : double -> float -> long -> int -> short ->
	 * byte -> char
	 */

	public static void main(String[] args) {

		byte k = 45;
		double c = k; // auto casting

		float p = 87657.3434f;
		int m = (int) p;

		long v = (long) p;

		byte z = (byte) p;
		System.out.println(z);
		
		int a = 45;
		int b = 8;
		
		float c1 = (float)a/b;
		System.out.println(c1);
		System.out.printf("%.3f",c1);
	}
}
