package lab1;

public class Student 
{
	 int id;
	String name;
	 Reportcard rc;
	
 Exam[] exam;
	 
	 public Student()
	 {
		 
	 }

	public Student(int id, String name ) 
	{
		
		this.id = id;
		this.name = name;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public void printStudent()
	{
		System.out.println("studentid="+id);
		System.out.println("studentname="+name);
		rc.printGrade();
		for (Exam exams : exam)
		{
		exams.printExam();
       }
	}
	public void calper()
	{
		float totalmarks=0.0f;
		float  grandtotal=0.0f;
		
		for (Exam exams : exam) 
		{
		totalmarks+=exams.max_marks;
		grandtotal+=exams.obtained_marks;
		}
		rc.percentage=grandtotal/totalmarks*100.0f;
		rc.calGrade();
		
		
	}
}
