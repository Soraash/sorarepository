package lab1;

public class Exam 
{
	String exam_name;
	  int max_marks;;
	 int obtained_marks;
	
	public Exam()
	{
		
	}

	public Exam(String exam_name, int max_marks, int obtained_marks) 
	{
		
		this.exam_name = exam_name;
		this.max_marks = max_marks;
		this.obtained_marks = obtained_marks;
	}
	
	public String getExam_name() {
		return exam_name;
	}

	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}

	public int getMax_marks() {
		return max_marks;
	}

	public void setMax_marks(int max_marks) {
		this.max_marks = max_marks;
	}

	public int getObtained_marks() {
		return obtained_marks;
	}

	public void setObtained_marks(int obtained_marks) {
		this.obtained_marks = obtained_marks;
	}

	public   void printExam()
	{
		System.out.println("exam_name"+exam_name);
		System.out.println("max_marks"+max_marks);
		System.out.println("obtained_marks"+obtained_marks);
	}
	
}
