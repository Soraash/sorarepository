package SIMPLE;

public class Findarea
{
	int radius;
	float area;
	int side;
	
	
	void print(int radius)
	{
		//radius=5;
		area=3.142f*radius*radius;
		System.out.println("area of circle ="+ area );
	}
	void print(int side,int side1)
	{
		area=side1*side1;
		System.out.println("area of square ="+ area);
	}
}
