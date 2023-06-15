public class Hey
{
	public static void main(String [] args)
	{
		int result;

		try
		{
			result = 10/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			result = 0;
			System.out.println("Finally block executed");
		}

		System.out.println(result);
	}

}

