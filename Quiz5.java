public class Quiz5
{
	/*
	// question 1
	public static int five(int a)
   	{
   		System.out.println("first");
      	return 5;
   	}

   public static int five(int b)
   {
   		System.out.println("second");

      	return 5;
   }

   public static void main(String [] args)
   {
      int a = 5;
      int b = 5;
      int x = five(b);
   }
   // This fails to compile because the five() method is not being overloaded; 
   // it's being redefined, and that's not acceptable.
   */

	/*
	// question 2
   public static int five(int a)
   {
   		System.out.println("first");

      	return 5;
   }

   public static int five(double b)
   {
   		System.out.println("second");

      	return 5;
   }

   public static void main(String [] args)
   {

      	int x = five(5.0);
   }
   // it call second one
   */

	/*
	// question 3
	public static int five(int a)
   	{
   		System.out.println("first");
      	return 5;
   	}

   public static double five(double b)
   {
   		System.out.println("second");
      	return 5;
   }

   public static void main(String [] args)
   {

      	int x = five(5.0);
   }
	// This fails to compile because of a typecasting (lossy conversion) error. 
	*/

	/*
	// question 4
	public static int five(int a)
   	{
   		System.out.println("first");

      	return 5;
   	}

   public static double five(int b)
   {
   		System.out.println("second");

      	return 5;
   }

   public static void main(String [] args)
   {
      	double x = five(5);
   }
   // This fails to compile because the five() method is not being overloaded; 
   // it's being redefined, and that's not acceptable.
   */

	/*
	// question 5
	public static int five(char a)
   	{
   		System.out.println("first");
      	return 7;
   	}

   public static char five(int b)
   {
   		System.out.println("second");
      	return 'y';
   }

   public static void main(String [] args)
   {
      	char x = five(10);
   }
   // it calls the second one.
   */

	/*
	// question 6
	public static int five(char a)
   	{
   		System.out.println("first");
      	return 7;
   	}

   public static char five(int b)
   {
   		System.out.println("second");
      	return 'y';
   }

   public static void main(String [] args)
   {
      	int x = five(10);
   }
   // it calls the second one.
   */

	/*
	// question 7
	public static int five(char a)
   {
      return 7;
   }

   public static char five(int b)
   {
      return 'y';
   }

   public static void main(String [] args)
   {
      char x = five('h');
   }
   // This fails to compile because of a typecasting (lossy conversion) error.

   
   /*
   // question 8
	public static int five(char a)
   {
      return 7;
   }

   public static char five(int b)
   {
      return 'y';
   }

   public static void main(String [] args)
   {
      int x = five('h');
   }
   // it calls the first one
   */

   
	// question 9
   public static char five(int a, int b)
   {
   		System.out.println("first");
      	return 'y';
   }

   public static char five(int a, double b)
   {
   		System.out.println("second");
      	return 'y';
   }

   public static char five(double b, int a)
   {	
   		System.out.println("third");
      	return 'y';
   }

   public static char five(double b, double a)
   {
   		System.out.println("fourth");
      	return 'y';
   }

   public static void main(String [] args)
   {
      int b = 6;
      double a = 3.2;
      int x = five(a, b);
      System.out.println((char)x);

   }
   //it calls the third one. 
}

