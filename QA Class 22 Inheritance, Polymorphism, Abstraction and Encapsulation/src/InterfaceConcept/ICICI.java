package InterfaceConcept;

public class ICICI implements CentralBank{

	public static void main(String[] args) {
		ICICI i= new ICICI();
		i.saving();
		i.insurance();
		i.loans();

	}

	@Override
	public void saving() {
		System.out.println("saving interest rate is 5.4");
		
	}

	@Override
	public void loans() {
		System.out.println("loan interest rate is 4.1");
		
	}

	@Override
	public void insurance() {
		System.out.println("insurance premium is 100$");
		
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void current() {
		// TODO Auto-generated method stub
		
	}

}
