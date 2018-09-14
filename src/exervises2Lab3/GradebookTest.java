package exervises2Lab3;

import java.util.Scanner;

public class GradebookTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Gradbook gradeBook1 = new Gradbook("CS101 Introduction to Java Programing","Sam Smith");
		gradeBook1.displayMessage();
		System.out.print("Changing instructor name to: ");
		String str = input.nextLine();
		gradeBook1.setInstructorName(str);
		gradeBook1.displayMessage(); 	
	}

}
