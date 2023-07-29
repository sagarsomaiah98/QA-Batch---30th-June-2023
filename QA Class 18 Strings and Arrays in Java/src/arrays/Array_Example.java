package arrays;

public class Array_Example {

	public static void main(String[] args) {
		//one dimensional array
		
		//DataType[] arrayName = new DataType[size]
		
		String[] student=new String[20];
		
		student[3]="Steve";
		student[0]="James";
		student[1]="Kevin";
		student[2]="Bob";
		student[3]="Alice";
		student[4]="Lee";
		student[0]="Andy";
		
		//System.out.println(student.length);
		
		/*
		 * System.out.println(student[0]); System.out.println(student[1]);
		 * System.out.println(student[2]); System.out.println(student[3]);
		 * System.out.println(student[4]);
		 */
		
		for(int i=0;i<student.length;i++)
			System.out.println(student[i]);
		
		
		

	}

}
