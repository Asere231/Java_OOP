public class RanNumber
{
	public static void test(int n, int m)
	{
		int i = (int)(Math.random() * m) + n;
		 System.out.println(i);
	}

	public static void main(String [] args)
	{
		test(10, 90);
	}
}
