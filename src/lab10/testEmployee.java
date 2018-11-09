package lab10;

public class testEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------1----------");
		SalariedEmployee em1 = new SalariedEmployee("june", "Bug", "123-45-6789", 10000.00);
		CommissionEmployee1 em2 = new CommissionEmployee1("Archie","Tic","987-65-43221",15000.00,0.10);
		System.out.printf("Employee 1:\n%s\n\n", em1);
		System.out.printf("Employee 2:\n%s\n\n", em2);
		System.out.println("---------2----------");
		Employee firstEmployee = new SalariedEmployee("June","Bug","123-45-6789",10000.00);
		Employee secondEmployee = new CommissionEmployee1("Archie", "Tic", "987-65-4321", 150000.00, 0.10);
		System.out.printf("Employee 1:\n%s\n\n", firstEmployee);
		System.out.printf("Employee 2:\n%s\n\n", secondEmployee);
		System.out.println("---------3----------");
		SalariedEmployee salaried = (SalariedEmployee) firstEmployee;
		System.out.printf("salaried:\n %s\n\n", salaried);
		System.out.println("---------4----------");
		CommissionEmployee1 com = (CommissionEmployee1) firstEmployee;
		System.out.printf("commission:\n%s\n\n",com);
	}

}
