package controlstatements.selection;

public class NestedIfTest {
	/*
	 * ============== Nested if-else ===================
	 * 
	 * syntax:
	 * 
	 * if(condition-1){
	 * 
	 * if(condition-2){
	 * 
	 * if(condition-3){
	 * 
	 * ................ .................... ............ ........................
	 * }else{
	 * 
	 * }
	 * 
	 * }else{
	 * 
	 * }
	 * 
	 * }else{
	 * 
	 * }
	 * 
	 */

	public static void main(String[] args) {

		String citizen = "nepali";
		int age = 50;
		boolean haveVoteId = false;

		if (citizen.equals("nepali")) {

			if (age >= 18) {

				if (haveVoteId) {
					System.out.println("u Can Vote");
				} else {
					System.out.println("U dont hv voter id");
				}

			} else {
				System.out.println("you are under age");
			}

		} else {
			System.out.println("invalid citizenship !!");
		}

	}

}
