public class Dice
{
	public static int r;

	public static int roll()
	{
		r = (int) (Math.random() * 13 + 2);

		return r;
	}

	public static void checkRoll(int r)
	{
		if (r == 7 || r == 11)
			System.out.println("Winnnnn!!!!");

		else if (r == 2 || r == 3 || r == 12)
			System.out.println("BOOOOOO!!!");

		else
			System.out.println("You've moved on!");
	}

	public static void main(String [] args)
	{
		int rl = roll();

		System.out.println(rl);
		System.out.println();

		checkRoll(rl);
	}
}
