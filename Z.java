class X
{
}

class Y extends X
{
}

public class Z extends Y
{
   public static void printObject(X x)
   {
      System.out.println(x);

      System.out.print("X object ");
      System.out.println(x instanceof X ? "[yes]" : "[no]");

      System.out.print("Y object ");
      System.out.println(x instanceof Y ? "[yes]" : "[no]");

      System.out.print("Z object ");
      System.out.println(x instanceof Z ? "[yes]" : "[no]");
   }

   public static void main(String [] args)
   {
      Y thing1 = new Z();
      printObject(thing1);

      System.out.println();

      Y thing2 = new Y();
      printObject(thing2);

      System.out.println();

      X thing3 = new Y();
      printObject(thing3);
   }
}
