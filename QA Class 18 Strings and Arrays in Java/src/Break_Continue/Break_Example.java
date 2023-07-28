package Break_Continue;

public class Break_Example {

	public static void main(String[] args) {
		int key=30;
		
		for(int i=1;i<15;i++) {
			
			System.out.println(i);
			if(key==i)//30==1,30==2 . . ..30==14
				break;
		}
		

	}

}
