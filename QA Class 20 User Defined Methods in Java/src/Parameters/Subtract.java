package Parameters;

public class Subtract {
	

    public void sub(int a, int b, int c) {
   	 
   	
   	 int res=a-b-c;
   	 System.out.println("Subtraction of three numbers "+a+" and "+b+" and "+c+" is "+res);
    }

	public static void main(String[] args) {
		Subtract s = new Subtract();
		s.sub(100, 20, 10);
		s.sub(3434, 44, 6);
		s.sub(21432, 54, 23);
		s.sub(54656, 3420, 343);

	}

}
