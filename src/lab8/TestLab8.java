package lab8;

public class TestLab8 {

	public static void main(String[] args) {
		Time2 t1 = new Time2(5);
		System.out.printf("The  time is %s\n",t1);
		Time2 t2 = new Time2(13,59,60);
		System.out.printf("The time is %s\n",t2);
		Time2 t3 = new Time2(0,30,0);
		Time2 t4 = new Time2(t3);
		System.out.printf("The time is %s\n",t4.toUniversalString());
		System.out.println("/////////////////4-6///////////////////");
		Person p = new Person("Ruu","Tic","male",21);
		System.out.println(p);
		Person p2 = new Person("Anna Lee","Tic");
		System.out.println(p2);
		Person p3 = new Person("Anna Lee","Tic","n/a",-1);
		System.out.println(p3);
	}

}
