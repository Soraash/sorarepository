
public class Transaction 
{
	private int  balance;
	private  int amount;
	
	public void deposit(int bal,int amount)throws NegativeAmountException 
	{
	if(amount<0)
	{
	throw new NegativeAmountException();
	 }
	else
	{
	 bal+=amount;
	System.out.println("After depositing Balance="+bal); 
	}
	

	}

	public void  withdraw(int bal,int amount) throws InsufficientBalance 
	{
	if(balance-amount<1000)
	{
	throw new InsufficientBalance();
	 }
	else
	{
		bal-=amount;
	System.out.println("After withdrawing Balance="+bal);
	 } 
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
