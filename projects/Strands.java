// Bryan Aneyro Hernandez
// COP 3330
// Spring 2023
// br867228

import java.util.Arrays;

public class Strands
{
  // The following 2 methods will help me apply the DRY principle.
  public static void space()
  {
    System.out.print(" ");
  }

  public static void spaceNth(int n)
  {
    for (int i = 0; i < n; i++)
    {
      System.out.print(" ");
    }
  }

  // Helper method for the last three.
  public static void printWithoutTrailingSpaces(char[] arr, int numSpaces)
  {

    int lastNonSpaceIndex = -1;

    // Get the index of the last character in the array.
    for (int j = 0; j < arr.length; j++)
    {
      if (arr[j] != ' ')
      {
        lastNonSpaceIndex = j;
      }
    }

    // Print pattern if lastNonSpaceIndex is a character.
    if (lastNonSpaceIndex != -1)
    {
      spaceNth(numSpaces);
    }

    // Print every character without the spaces in the array.
    for (int i = 0; i <= lastNonSpaceIndex; i++)
    {
      System.out.print(arr[i]);

      if (i < lastNonSpaceIndex)
      {
        System.out.print("  ");
      }
    }
  }

  public static void straightAndNarrow(String str)
  {
    if (str == null)
    {
      System.out.println("Pshh!");
      return;
    }

    // In this loop I will use the method .charAt() to print the chars in the passed string.
    for (int i = 0; i < str.length(); i++)
    {
      if (str.charAt(i) == ' ')
        System.out.println();
      else
      {
        space();
        space();
        System.out.print(str.charAt(i));
        System.out.println();
      }
    }
  }

  public static void straightAndNarrow(String str, int n)
  {
    if (str == null)
    {
      System.out.println("Pshh!");
      return;
    }

    // In this loop I will use the method .charAt() to print the chars in the passed string.
    for (int i = 0; i < str.length(); i++)
    {
      if (str.charAt(i) == ' ')
        System.out.println();
      else
      {
        spaceNth(n);
        System.out.println(str.charAt(i));
      }
    }
  }

  public static void meanderingPath(String str)
  {
    int [] spacing = {2, 2, 2, 3, 4, 5, 5, 5, 4, 3};
    int init = 0;
    int numSpaces = spacing[init];
    int firstLine = 3;
    int count = 0;

    if (str == null)
    {
      System.out.println("Pshh!");
      return;
    }

    // This loop prints the patterned string.
    for (int i = 0; i < str.length(); i++)
    {
      init = (count + 1) % spacing.length; // will update the index and wrap around.

      if (count == 0)
      {
        numSpaces = firstLine;
        count++;
      }
      else
      {
        numSpaces = spacing[(count - 1) % spacing.length];
      }

      if (str.charAt(i) == ' ')
      {
        System.out.println();
      }

      else
      {
        spaceNth(numSpaces);
        System.out.println(str.charAt(i));
      }

      count++;
    }
  }

  public static void classicRapunzel(String [] strings)
  {
    // Data used for the pattern.
    int [] spacing = {2, 2, 2, 3, 4, 5, 5, 5, 4, 3};
    int init = 0;
    int numSpaces = spacing[init];
    int firstLine = 3;
    int count = 0;

    // Data used to print out the input.
    int numStrings = strings.length;
    int largestString = 0;
    int index = 0;

    if (strings == null)
    {
      System.out.println("Pshh!");
      return;
    }

    // Get the length of the longest string.
    for (int i = 0; i < numStrings; i++)
    {
      if (strings[i].length() > largestString)
      {
        largestString = strings[i].length();
      }
    }

    for (int i = 0; i < largestString; i++)
    {
      // In this first loop I will create a char array, and print out the spaces for the pattern.
      char [] charArray = new char[numStrings];

      Arrays.fill(charArray, ' ');

      init = (count + 1) % spacing.length;

      if (count == 0)
      {
        numSpaces = firstLine;
        count++;
      }
      else
      {
        numSpaces = spacing[(count - 1) % spacing.length];
      }

      count++;

      index = 0;
      for (int j = 0; j < numStrings; j++)
      {
        // Stores only the first char of each string
        if (i < strings[j].length())
        {
          charArray[index++] = strings[j].charAt(i);
        }
        else
        {
          charArray[index++] = ' ';
        }
       }

       printWithoutTrailingSpaces(charArray, numSpaces);

      System.out.println();

    }
  }

  public static void steamyMocha(String [] strings)
  {
    // Data used for the pattern.
    int [] spacing = {2, 2, 2, 3, 4, 5, 5, 5, 4, 3};
    int init = 0;
    int numSpaces = spacing[init];
    int firstLine = 3;
    int count = 0;

    // Data used to print out the input.
    int numStrings = strings.length;
    int largestString = 0;
    int index = 0;

    if (strings == null)
    {
      System.out.println("Pshh!");
      return;
    }

    // Get the length of the longest string.
    for (int i = 0; i < numStrings; i++)
    {
      if (strings[i].length() > largestString)
      {
        largestString = strings[i].length();

        if (i % 2 == 1)
        {
          largestString = largestString + 1;
        }
      }
    }

    for (int i = 0; i < largestString; i++)
    {
      // In this first loop I will create a char array print out the spaces for the pattern.
      char [] charArray = new char[numStrings];

      init = (count + 1) % spacing.length;

      if (count == 0)
      {
        numSpaces = firstLine;
        count++;
      }
      else
        numSpaces = spacing[(count - 1) % spacing.length];

      count++;

      for (int j = 0; j < numStrings; j++)
      {
        // Stores only the first char of each string, and modifying array to make it steamy.
        if (j % 2 == 1 && i == 0)
        {
          charArray[j] = ' ';
        }
        else if (j % 2 == 1 && i <= strings[j].length())
        {
          charArray[j] = strings[j].charAt(i - 1);
        }
        else if (i < strings[j].length())
        {
          charArray[j] = strings[j].charAt(i);
        }
        else
        {
          charArray[j] = ' ';
        }
      }

      printWithoutTrailingSpaces(charArray, numSpaces);

      System.out.println();
    }
  }

  public static void cascadingWaterfall(String [] strings)
  {
    // Data used for the pattern.
    int [] spacing = {2, 2, 2, 3, 4, 5, 5, 5, 4, 3};
    int init = 0;
    int numSpaces = spacing[init];
    int firstLine = 3;
    int count = 0;

    // Data used to print out the input.
    int numStrings = strings.length;
    int largestString = 0;
    int index = 0;

    if (strings == null)
    {
      System.out.println("Pshh!");
      return;
    }

    // Get the length of the longest string.
    for (int i = 0; i < numStrings; i++)
    {
      if (strings[i].length() > largestString)
      {
        largestString = strings[i].length();

        if (i < numStrings)
        {
          largestString += i;
        }
      }
    }

    for (int i = 0; i < largestString; i++)
    {
      // In this first loop I will create a char array and print out the spaces for the pattern.
      char [] charArray = new char[numStrings];

      init = (count + 1) % spacing.length;

      if (count == 0)
      {
        numSpaces = firstLine;
        count++;
      }
      else
      {
        numSpaces = spacing[(count - 1) % spacing.length];
      }

      count++;

      for (int j = 0; j < numStrings; j++)
      {
        // In this loop I will store the charaters, and formatting for the waterfall effect.
        if ( i - j >= 0 && i - j < strings[j].length())
        {
          charArray[j] = strings[j].charAt(i - j);
        }
        else
        {
          charArray[j] = ' ';
        }
      }

      printWithoutTrailingSpaces(charArray, numSpaces);

      System.out.println();

    }
  }

  public static double difficultyRating()
  {
    return 4.0;
  }

  public static double hoursSpent()
  {
    return 20.0;
  }

}
