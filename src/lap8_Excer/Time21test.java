package lap8_Excer;

import java.util.Scanner;

public class Time21test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Time21 time = new Time21();
		int choice = getMenuChoice();
		while(choice != 5) {
			switch(choice) {
				case 1: 
					int hours;
					do {
						System.out.print("Enter Hours: ");
						hours  = input.nextInt();
					} while (hours < 0 || hours > 23 );
					time.setHour(hours);
					break;
				case 2:
					int minutes;
					do {
						System.out.print("Enter Minutes: ");
						minutes  = input.nextInt();
					} while (minutes < 0 || minutes > 59 );
					time.setMinute(minutes);
					break;
				case 3:
					int seconds;
					do {
						System.out.print("Enter Seconds: ");
						seconds  = input.nextInt();
					} while (seconds < 0 || seconds > 59 );
					time.setSecond(seconds);
					break;
				case 4:
					time.tick();
					break;		
			}
			
			System.out.printf("Hour: %d Minute: %d Second: %d\n", time.getHour(), time.getMinute(), time.getSecond());
			System.out.printf("Universal time: %s Standard time: %s\n", time.toUniversalString(), time.toString());
			choice = getMenuChoice();
		}
	}
	
	private static int getMenuChoice() {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Set Hour");
		System.out.println("2. Set Minute");
		System.out.println("3. Set Second");
		System.out.println("4. Add 1 second");
		System.out.println("5. Exit");
		System.out.print("Choice:");
		return input.nextInt()
;		
	}

}
