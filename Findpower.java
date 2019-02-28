package SIMPLE;
 class Findpower 
{
	int x;
	int y;
	 int result;
	void power(int x, int y) 
	{
		  result = x; 
		  for (int i = 1; i < y; i++) 
		  { 
			  result = result * x;
		  }
		  System.out.println("result=");
	}

}
