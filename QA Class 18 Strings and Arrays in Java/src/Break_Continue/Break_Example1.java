package Break_Continue;

public class Break_Example1 {

	public static void main(String[] args) {
		
		for(int i=3;i<=30;i=i+3) {
			
			System.out.println(i);
			if(i%5==0)//3%5==0 6%5==0 9%5==0 12%5==0 15%5==0
				break;
		}

	}

}
