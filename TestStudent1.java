package SIMPLE;

import java.util.Scanner;

public class TestStudent1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of students");
	

		Student[] students = new Student[scan.nextInt()];
		for (int i = 0; i < students.length; i++) 
		{
			System.out.println("Enter information for student " + (i + 1));
			System.out.println("Enter id");
			int id = scan.nextInt();
			
			System.out.println("Enter name");
			String name = scan.next();
			
			System.out.println("Enter percentage");
			float percentage = scan.nextFloat();

			
			Student s = new Student(id, name, percentage);
			students[i] = s;
		}
		
		for (int i = 0; i < students.length; i++) {
			System.out.println("Displaying information for students " + (i + 1));
			students[i].print();
	}

}
}
