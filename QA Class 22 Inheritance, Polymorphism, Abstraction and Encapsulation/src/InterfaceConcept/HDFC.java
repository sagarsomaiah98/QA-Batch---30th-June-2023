package InterfaceConcept;

public class HDFC implements CentralBank{

	public static void main(String[] args) {
    HDFC h = new HDFC();
    h.savings();
    
    h.insurance();

	}

	@Override
	public void savings() {
		System.out.println("hdfc minimum saving balance is 25000 dollars");
		
	}

	
	

	@Override
	public void insurance() {
		System.out.println("HDFC insurance charges are 100$ per year");
		
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

}
