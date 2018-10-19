package lab6;

import java.util.Scanner;
public class Greeting {
	int inputNumber;
	String greetingString;
	public void greeting() {
		Scanner input = new Scanner(System.in);
		System.out.print(
				"Enter 1 for an English greeting\nEnter 2 for a Spanish greeting");
		inputNumber = input.nextInt();
		greet(inputNumber);
		System.out.println(greetingString);
	}
	public void greet(int x) {
		if(x == 1)
			greetingString = "Hello.";
			else if(x==2)
				greetingString = "Hola.";
				else
					greetingString = "invalid input";
	}
}
