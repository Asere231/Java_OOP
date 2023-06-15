public class StaticOrNot
{
   public static int x;
   public int y;

   public static void main(String [] args)
   {
      StaticOrNot s1 = new StaticOrNot();
      StaticOrNot s2 = new StaticOrNot();

      s1.x = 50;
      StaticOrNot.x = 60;
      s2.x = 70;

      System.out.println(StaticOrNot.x);
      System.out.println(s1.x);
      System.out.println(s2.x);

      s1.y = 10;
      s2.y = 20;

      System.out.println(s1.y);
      System.out.println(s2.y);
   }
}
