package abstraction;

public class PrabhuBank extends CentralBank{

	@Override
	protected void getBankName() {
	 System.out.println("Prabhu bank");
		
	}

	@Override
	protected void getInterestRate() {
		System.out.println("20%");
	}

	
}
