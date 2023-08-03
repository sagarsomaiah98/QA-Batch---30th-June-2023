package InterfaceConcept;

public class ICICI implements CentralBank {

	public static void main(String[] args) {
		ICICI i = new ICICI();
		i.savings();
		i.creditcard();
		i.insurance();

	}

	@Override
	public void savings() {
		System.out.println("icici minimum saving balance is 20000 dollars");
		
	}

	
	public void creditcard() {
		System.out.println("icici credit charges are 50$ per year");
		
		
	}

	@Override
	public void insurance() {
		System.out.println("icici insurance charges are 50$ per year");
		
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

}
