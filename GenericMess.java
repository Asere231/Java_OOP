// Consider the following code, and then answer the question that follows.

import java.util.ArrayList;

public class GenericMess<SomeType>
{
   SomeType [] array = null;

   GenericMess(int n)
   {
      array = new SomeType[n];
   }

   public void printArrayElements()
   {
      for (int i = 0; i < array.length; i++)
         printTheThing(array[i]);
   }

   public static void printTheThing(SomeType data)
   {
      System.out.println(data);
   }

   public static void main(String [] args)
   {
      GenericMess<int> gm = new GenericMess<>(11);
      gm.printArrayElements();
   }
}
//What all is wrong with this code? Select all that apply.
