public class CaughtException 
{
	public static void main(String[] args) throws Exception
	{
		test();
		Thread.sleep(1000 * 60);
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
