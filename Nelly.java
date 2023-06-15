class Ay
{
	public static int yep = 20;

	public static int Huh(int i)
	{
		return i + yep;
	}

}

public class Nelly
{
	public static void main(String [] args)
	{
		Ay a = new Ay();

		int yay = a.Huh(6);

		System.out.println(yay);
	}
}
