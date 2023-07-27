package Conditions;

public class Multiple_if_Else {

	public static void main(String[] args) {
		int a=20;
		int b= 30;
		int c=50;
		
		if(a>b) //true
		{
			if(a>c)//true
				System.out.println(a+" is greater");
		}
		else if(b>c)//true
			System.out.println(b+" is greater");
		else
			System.out.println(c+" is greater");
		
		

	}

}
