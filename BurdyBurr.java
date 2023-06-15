public class BurdyBurr<AnyType>
{
   AnyType burr;

   public void foo()
   {
      lerpdeedurr(this.burr);
      derpyderr(this);
      herpdeehurr(this.burr);
   }

   public static void lerpdeedurr(AnyType b)
   {
      System.out.println(b);
   }

   public static void derpyderr(BurdyBurr<?> b)
   {
      System.out.println(b);
   }

   public void herpdeehurr(AnyType b)
   {
      System.out.println(b);
   }
}
