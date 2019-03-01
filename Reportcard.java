package lab1;

public class Reportcard {
	float percentage;
	String grade;
	 
	public Reportcard()
	{
		
	}
	
	 public Reportcard(int percentage) {
		super();
		this.percentage = percentage;
		
	}

	 
	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	

	void calGrade()
	 {
		 if (percentage>40 && percentage<60)
		 {
			 grade="SC";
			 
		 }
		 else if (percentage>60 && percentage<80)
		 {
			 grade="FC";
		 }
		 else if (percentage>80)
		 {
			 grade="distinction";
		 }
	 }
	 void printGrade()
	 {
		 System.out.println("grade="+grade);
		 System.out.println("percent="+percentage);
	 }
	 
}
