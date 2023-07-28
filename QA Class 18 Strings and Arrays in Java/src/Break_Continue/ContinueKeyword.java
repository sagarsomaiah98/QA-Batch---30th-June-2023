package Break_Continue;

public class ContinueKeyword {

	public static void main(String[] args) {
		//continue will skip the below lines when condition is true
int key=3;
		
		for(int i=1;i<11;i++) {
			
			
			if(key==i)
				continue;
			System.out.println(i);
		}

	}

}
