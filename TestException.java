
public class TestException {

	public static void main(String[] args) 
	{
		Transaction t = new Transaction();
		 try
		 { 
			 t.deposit(10000, 5000); 
		 t.withdraw(15000, 25000);
		 }
		
		 catch(InsufficientBalance iae)
		 {
		 iae.printStackTrace();
		 } 
		 catch (NegativeAmountException e) 
		 {
			 
			
			e.printStackTrace();
}
		
	}

}
