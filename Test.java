package SIMPLE;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the id ");
		int id = scan.nextInt();

		System.out.println("enter the name ");
		String name = scan.next();

		System.out.println("enter the salary");
		Float salary = scan.nextFloat();

		Employee e = new Employee(id, name, salary);
		e.print();
	scan.close();
	}

}
