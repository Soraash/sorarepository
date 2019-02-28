package SIMPLE;

import java.util.Scanner;


public class TestStudent {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the studentid ");
		int studentid=scan.nextInt();
		
		System.out.println("enter the student_name");
		String studentname=scan.next();
		
		System.out.println("enter the total number of subjects size ");
		int size=scan.nextInt();
		
		System.out.println("enter the student_marks");
		int[]marks=new int[size];
		for (int i = 0; i < marks.length; i++) 
		{
			marks[i]=scan.nextInt();
			
		}
		
		System.out.println("The marks are =");
		for (int i = 0; i < marks.length; i++) 
		{
			System.out.println(marks[i]);
		}
			
			int total = 0;
			for (int i = 0; i < marks.length; i++) 
			{
				total=total+marks[i];
			}
			System.out.println("sum of marks is  ="+ total);
			int percentage=total*100/(size*100);
			System.out.println("the student percent is ="+percentage);
	}

	

}
