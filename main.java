package lab1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Reportcard r = new Reportcard();
		System.out.println("Enter no of students");
		int noStudents = scan.nextInt();
		Student stu[] = new Student[noStudents];
		for (int j = 0; j < noStudents; j++) {
			Student s = new Student();
			System.out.println(" enter the id and name");
			s.setId(scan.nextInt());
			s.setName(scan.next());

			System.out.println("Enter number of exams ");
			Exam[] exam = new Exam[scan.nextInt()];

			for (int i = 0; i < exam.length; i++) {
				System.out.println("Enter details for exams are : " + (i + 1));

				Exam temp = new Exam();

				System.out.println("enter the exam_name");
				temp.setExam_name(scan.next());

				System.out.println("enter the max_marks");
				temp.setMax_marks(scan.nextInt());

				System.out.println("enter the obtained_marks");
				temp.setObtained_marks(scan.nextInt());
				exam[i] = temp;
			}
			s.rc = r;
			s.exam = exam;
			s.calper();
					stu[j]=s;
		}
		for (Student student : stu) 
		{
			student.printStudent();
		}
	}

}
