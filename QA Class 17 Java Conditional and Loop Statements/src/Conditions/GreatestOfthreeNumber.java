package Conditions;

public class GreatestOfthreeNumber {

	public static void main(String[] args) {
	
		int a=40;
		int b=20;
		int c =30;
		
		if(a>b & a>c)// true & true
			System.out.println(a+" is greater");
		else if(b>c)
			System.out.println(b+"is greater");
		else
			System.out.println(c+" is greater");

	}

}
