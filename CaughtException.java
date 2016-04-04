public class CaughtException 
{
	public static void main(String[] args) throws Exception
	{
		Thread.sleep(1000 * 30);
		test();
		Thread.sleep(1000 * 30);
	}
	
	public static void test() throws Exception
	{
		try 
		{
			throw new NullPointerException();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
