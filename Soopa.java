class Subby extends Soopa
{
   public static void foo()
   {
      System.out.print("subby");
   }
}

public class Soopa
{
   public static void foo()
   {
      System.out.print("soopa");
   }

   public static void doThing(Soopa thing)
   {
      thing.foo();
      System.out.println();
   }

   public static void main(String [] args)
   {
      Soopa  thing = new  Soopa ();
      Subby  thing1 = new  Subby ();
      Soopa  thing2 = new  Subby ();


      // Output format: xxxxx-yyyyy

      thing1.foo();
      System.out.print("-");
      doThing(thing2);
   }
}
