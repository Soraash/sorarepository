package SIMPLE;

public class Findprime 
{
	int num;
	int prime;
	int count;
	
	
	void find(int num)
	{
		count=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
		System.out.println("it is a prime number=" + num );
		}
		else 
		{
			System.out.println("not a prime number");
		}
}
}
