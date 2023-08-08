package Waits;

public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("LINE 1");
		Thread.sleep(2000);
		System.out.println("LINE 2");
		Thread.sleep(3000);
		System.out.println("LINE 3");
		Thread.sleep(10000);
		System.out.println("LINE 4");
		Thread.sleep(5000);
		System.out.println("LINE 5");

	}

}
