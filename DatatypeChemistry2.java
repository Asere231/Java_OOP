public class DatatypeChemistry2
{
   public static void main(String [] args)
   {
      double a = 5.9;
      double b = 8.3;
      int c = 4;
      int d = 8;

      int integer_result = (int)((a + b) * c * d + 4 * 8 * 5.0 - b * 1.3);
      double double_result = (a + b) * c * d + 4 * 8 * 5.0 - b * 1.3;

      System.out.printf("%d\n", integer_result);
      System.out.printf("%.6f\n", double_result);
   }
}
