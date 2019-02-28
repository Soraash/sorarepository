package SIMPLE;

public class Student {

	int id;
	String name;
	float percentage;

	public Student(int id, String name, float percentage) 
	{
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public void print() 
	{
		System.out.println("id="+ id);
		System.out.println("name="+ name);
		System.out.println("percentage="+ percentage);
		
	}

	

}
