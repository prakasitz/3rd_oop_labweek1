package oop_labweek3;

import java.util.Scanner;

public class Value {
	private static Scanner scr;
	public static void main(String[] args) {
		int x,xLimit;
		scr = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter x: ");
			x = scr.nextInt();
			System.out.print("Enter xLimit: ");
			xLimit = scr.nextInt();
			while (x<=xLimit) {
				x++;
				if(x%2==0)
					System.out.printf("%d is even.\n", x);
				else 
					System.out.printf("%d is ood.\n", x);
			}
		}
	}
}
