package test_midterm;
public class Student {
	private int IDnumber;
	private int creditHour;
	private int gpa;

	public Student(int i, int j, int k) {
		IDnumber = i;
		creditHour = j;
		gpa = k;
	}

	public int getGpa() {
		if(gpa > 0 ) {
			return this.gpa;
		} else {
			this.gpa = 0;
			return gpa;
		}
	}
	public int getID() {
		return IDnumber;
	}
	public int getCredit() {
		return creditHour;
	}
}
