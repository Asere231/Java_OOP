import java.util.Arrays;

public class ArrayThis
{
	public static void main(String [] args)
	{
		int [] array = new int[20];

		Arrays.fill(array, 11);

		for (int i = 0; i < array.length; i++)
			System.out.println(Arrays.toString(array));
	}
}
