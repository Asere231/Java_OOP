public class Exceptional
{
   public static void go() throws RuntimeException
   {
      System.out.println("Here we go!");

      int [] array1 = null;
      int [] array2 = new int[10];

      int i = -1;

      array1[i] = 12;

      System.out.println("No problem!");

      array2[i] = 12;

      System.out.println("Tada!");
   }

   public static void main(String [] args)
   {
      go();
      System.out.println("Bloop!");
   }
}
