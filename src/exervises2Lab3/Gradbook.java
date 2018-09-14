package exervises2Lab3;

public class Gradbook {
	private String courseName;
	private String instructorName;
	public Gradbook(String name,String name2) {
		courseName = name;
		instructorName = name2;
	}
	
	public void setCourseName(String name) {
		courseName = name;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setInstructorName(String name) {
		instructorName = name;
	}
	
	public String getInstructorName() {
		return instructorName;
	}
	public void displayMessage() {
		System.out.printf("Welcome to the grade book for\n%s!\n", getCourseName());
		System.out.printf("This courseee is presented by:%s\n\n", getInstructorName());
	}
}

