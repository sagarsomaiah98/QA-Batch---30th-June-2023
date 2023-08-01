package Methods;

public class Math {
	
	public void add()
	{
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("Adddition of two numbers "+a+" and "+b+" is "+c);
	}
	
	public void sub()
	{
	int j=40;
	int k=15;
	int p=j-k;
	System.out.println("Subtraction of two numbers "+j+" and "+k+" is "+p);
	}
	
	public static void main(String[] args) {
		
		Math m= new Math();
		m.add();
		m.sub();
		m.add();
		m.add();
		m.sub();
		m.add();
		
		
	}

}
