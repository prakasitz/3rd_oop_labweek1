package test_midterm;

public class showStudent {

	public static void main(String[] args) {
		Student stdObj = new Student(59050083,27,0);
		System.out.println("studentID: "+stdObj.getID());
		System.out.println("studentCreditHour: "+stdObj.getCredit());
		System.out.println("studentGPA: "+stdObj.getGpa());
		System.out.println();
	}

}
