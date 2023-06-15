// Bryan Aneyro Hernandez
// COP 3330
// Spring 2023
// br867228


public class LyricalDecomposition
{
	// Here I will create methods for the sentences that I can re-use whenever I want.

	public static void Middle_sentence3()
	{
		System.out.println("She swallowed the bird to catch the spider;");
	}

	public static void Middle_sentences4()
	{
		System.out.println("She swallowed the cat to catch the bird;");
		Middle_sentence3();
	}
	
	public static void Middle_sentences5()
	{
		System.out.println("She swallowed the dog to catch the cat;");
		Middle_sentences4();
	}

	public static void Static_middle_sentence()
	{
		System.out.println("She swallowed the spider to catch the fly.");
	}

	public static void Beforelast_last_sentences()
	{
		System.out.println("I don't know why she swallowed that fly;");
		System.out.println("Perhaps she'll die.");
	}

	// Now I will create methods for each verse, the goal is to have a clean main().

	public static void First_verse()
	{	
		System.out.println("There was an old woman who swallowed a fly.");
		Beforelast_last_sentences();
	}

	public static void Second_verse()
	{
		System.out.println("There was an old woman who swallowed a spider.");
		System.out.println("That wriggled and iggled and jiggled inside her!");
		Static_middle_sentence();
		Beforelast_last_sentences();
	}

	public static void Third_verse()
	{
		System.out.println("There was an old woman who swallowed a bird.");
		System.out.println("How absurd, to swallow a bird!");
		Middle_sentence3();
		Static_middle_sentence();
		Beforelast_last_sentences();
	}

	public static void Fourth_verse()
	{
		System.out.println("There was an old woman who swallowed a cat.");	
		System.out.println("Imagine that, to swallow a cat!");
		Middle_sentences4();
		Static_middle_sentence();
		Beforelast_last_sentences();
	}

	public static void Fifth_verse()
	{
		System.out.println("There was an old woman who swallowed a dog.");	
		System.out.println("What a hog, to swallow a dog!");
		Middle_sentences5();
		Static_middle_sentence();
		Beforelast_last_sentences();
	}

	public static void Last_verse()
	{
		System.out.println("There was an old woman who swallowed a horse.");
		System.out.println("She died, of course!");
	}

	public static void New_line()
	{
		System.out.print("\n");
	}

	public static double difficultyRating()
	{
		double x = 3.0;
		return x;
	}

	public static double hoursSpent()
	{
		double y = 4.0;
		return y;
	}
	public static void main(String [] args)
	{
		First_verse();
		New_line();
		Second_verse();
		New_line();
		Third_verse();
		New_line();
		Fourth_verse();
		New_line();
		Fifth_verse();
		New_line();
		Last_verse();

		difficultyRating();
		hoursSpent();
	}
} 
