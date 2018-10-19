package lab6;

public class programOutput {

	public static void main(String[] args) {
		System.out.println("***************");
		// 1.
		int a_1 = 5;
		int b_1 = -6;
		System.out.println(Math.max(Math.abs(b_1),a_1));
		// 2 
		System.out.println("***************");
		int a_2 = -6;
		System.out.println(Math.sqrt(Math.pow(Math.abs(a_2), 2)));
			//int a_2_2 = 6;
		System.out.println(Math.sqrt(Math.pow(Math.abs(a_2), 2)));
		// 3
		System.out.println("***************");
		int a_3 = 6;
		System.out.println(method1(a_3));
		int a_3_1 = 15;
		System.out.println(method1(a_3_1));
		int a_3_2 = 10;
		System.out.println(method1(a_3_2));
		int a_3_3 = -10;
		System.out.println(method1(a_3_3));
		// 4
		System.out.println("***************");
		int a_4 = 15;
		int b_4 = 5;
		System.out.println(method1(method1(a_4))+method1(b_4));
		int a_4_1 = 0;
		int b_4_1 = 0;
		System.out.println(method1(method1(a_4_1))+method1(b_4_1));
		int a_4_2 = 5;
		int b_4_2 = 15;
		System.out.println(method1(method1(a_4_2))+method1(b_4_2));
		int a_4_3 = -10;
		int b_4_3 = 10;
		System.out.println(method1(method1(a_4_3))+method1(b_4_3));
		// 5
		System.out.println("***************");
		Greeting app  = new Greeting();
		app.greeting();
	}
	
	public static int method1 (int x) {
		if(x <= 10) 
			x += 10;
		else 
			x -= 10;
		return x;
	}

}
