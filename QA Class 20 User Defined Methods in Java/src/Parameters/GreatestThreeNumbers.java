package Parameters;

public class GreatestThreeNumbers {
	
	
	public void greatest(int a, int b, int c) {
		

		if(a>b & a>c)// true & true
			System.out.println(a+" is greater");
		else if(b>c)
			System.out.println(b+" is greater");
		else
			System.out.println(c+" is greater");

	}

	public static void main(String[] args) {
		GreatestThreeNumbers g = new GreatestThreeNumbers();
		g.greatest(23, 40, 20);
		g.greatest(33, 410, 2100);
		g.greatest(7456, 750, 20);
		g.greatest(65, 856, 89);
		

	}

}
