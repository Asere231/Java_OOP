public class WhatCouldGoWrong
{
   public static int [] createAndPopulateArray(int n, int index, int key)
   {
      int [] array;

      try
      {
         array = new int[n];
         array[index] = key;
      }
      catch (Exception e)
      {
         System.out.println("Caught Exception: " + e);
      }

      return array;
   }

   public static void main(String [] args)
   {
      // Example usage.
      createAndPopulateArray(100, 103, 44);
   }
}
