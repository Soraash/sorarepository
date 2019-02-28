package SIMPLE;

public class Employee 
{
	int id;
	String name;
	float salary;
	
	public Employee(int id, String name, float salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void print()
	{
		System.out.println("id="+ id);
		System.out.println("name="+ name);
		System.out.println("salary="+ salary);
		
	}

}
