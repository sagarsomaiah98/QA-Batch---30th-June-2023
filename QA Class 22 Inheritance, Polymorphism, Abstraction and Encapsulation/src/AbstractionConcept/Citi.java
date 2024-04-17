package AbstractionConcept;

public class Citi extends Bank {

	public static void main(String[] args) {
		Citi c = new Citi();
		c.savings();
		c.insurance();
		c.kyc();

	}

	@Override
	public void savings() {
		System.out.println("citi savings account min is 25k $");
		
	}

	@Override
	public void insurance() {
		System.out.println("citi insurance is 50$");
		
	}

}
