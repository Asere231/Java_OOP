public class Random
{
	// Write a method that takes two integer parameters, m and n, and returns a
	// random integer on the range m through n (inclusively)
	public static int getRando(int m, int n)
	{
		int i = (int) (Math.random() * (n - m+ 1) + m);
		System.out.println(i);

		return i;
	}

	public static void testRando(int m, int n)
	{

	 	boolean [] seen = new boolean[m * n];
	 	int count = 0;

	 	while (count < n - m + 1)
	 	{
	 		int r = getRando(m, n);

	 		if (!seen[r - m])
	 		{
	 			System.out.println(r);
	 			seen[r - m] = true;
	 			count ++;
	 		}
	 	}
	}

	public static void main(String [] args)
	{
		testRando(20, 30);
	}

}
