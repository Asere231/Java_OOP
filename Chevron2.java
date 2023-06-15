public class Chevron2
{
	public static void printChevron(int n)
	{
		for (int i = n; i > 0; i--)
		{
			System.out.print("@");
		}

		for (int i = n; i > 0; i--)
		{
			System.out.print("*");
		}

		for (int i = n; i > 0; i--)
		{
			System.out.print("@");
		}

		System.out.println();

		n--;
	}

	public static void main(String [] args)
	{
		int num = 4;

		for (int i = num; i > 0; i--)
		{
			if (i < num)
				printChevron(i);
		}


	}
}
