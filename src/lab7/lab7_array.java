package lab7;

import org.omg.CORBA.UNKNOWN;

public class lab7_array {

	public static void main(String[] args) {
		System.out.println("-------1--------");
			int array_1[] = { 8,6,8,7,6,4,4,5,8,10};
			System.out.println("index Value");
			for(int i=0; i < array_1.length;i++) {
				System.out.printf("%d%d\n",i, array_1[i]);
			}
		System.out.println("-------2--------");
			char sentence[] = {'H','o','w',' ','a','r','e',' ','y','o','u'};
			String output_2 = "The sentence is: ";
			for( int i = 0; i < sentence.length; i++) {
				System.out.printf("%c\n", sentence[i]);
			}
		System.out.println("-------3--------");
			int array_3[] = {1,2,3,4,5,6,7,8,9,10};
			for(int i = 0; i < array_3.length; i++) {
				for(int j = 0; j < array_3[i]; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		System.out.println("-------4--------");
			int array_4[] = {3,2,5};
			for(int i = 0; i < 3; i++) {
				array_4[i] *=2;
			}
			for(int j : array_4) {
				System.out.printf("%d",j);
			}
			System.out.println();
		System.out.println("-------5--------");
			int array_5[] = {1,2,3,4,5};
			System.out.println(method1_5(array_5));
		System.out.println("-------6--------");
			int array_6[][] = {{3,2,5},{2,2,4,5,6},{1,1}};
			lab7_array x  = new lab7_array();
			System.out.println(x.method1_6(array_6));
		System.out.println("-------Array2D--------");
			int a[][] = {
					{1,2,3},
					{4,5,6,7},
					{8,9,10},
					{11,12,13,14}
					};
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[i].length; j++) {
					System.out.printf("%4d",a[i][j]);
				}
				System.out.println();
			}
	}
	
	public static int method1_5(int[] array_5) {
		int mystery = 1;
		for(int i: array_5) {
			mystery *= i;
		}
		return mystery;
	}
	
	public int method1_6(int values[][]) {
		int mystery = 1;
		for(int i[] :values) {
			for (int j:i) {
				mystery *= j;
			}
		}
		return mystery;
	}

}
