/*	Given 2 strings, return their concatenation, except omit the first char of each. 
	The strings will be at least length 1.


nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"  */

public class CodingBatStrings
{

public String nonStart(String a, String b) {

char[] result = new char[a.length() + b.length() - 2];
  int index = 0;
  for (int i = 1; i < a.length(); i++)
  {
    result[index] = a.charAt(i);
    index++;
  }
  for (int i = 1; i < b.length(); i++) 
  {
    result[index] = b.charAt(i);
    index++;
  }

  return new String(result);
  
}
/* The method .charAt() will return the the char it converted from a string at a given
   index, that's why we can use it inside the for-loop to iterate through the strings
   a and b, by saying a.charAt(i) and b.charAt(i).
   We created a result array with the lenght of the two string minus 2 (meaning, minus the 
   first letter of each string). Result will store the newly created array with the 
   updeted leght */



/* Given a string, return a "rotated left 2" version where the first 2 chars are moved 
   to the end. The string length will be at least 2.


left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"   */

public String left2(String str) 
{
  
  int l = str.length();
  char [] w = new char[l];
  
  int n = 2;
  
  for (int i = n; i < l; i++)
    w[i - n] = str.charAt(i);
    
  w[l - n] = str.charAt(0);
  w[l - 1] = str.charAt(1);
  
  
  return new String(w);
}

/* Here I created a new char array for fit the string length(l), since we were rotation left 
	2 times, I decided to create an int to store that value(n). Then I looped through the 
	array from the seconde index, because we needed to skipped the first two chars to make
	it rotate. Then I copied the first two chars(which we skipped) into the last two places
	in the new array. then returned it as a new String. */




/*  Given a string, return a "rotated right 2" version where the last 2 chars are moved to 
	the start. The string length will be at least 2.


right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"    */

public String right2(String str) 
{
  
  int l = str.length();
  char [] w = new char[l];
  
  int n = 2;
  
  for (int i = 0; i < l - n; i++)
    w[i + n] = str.charAt(i);
    
  w[0] = str.charAt(l - n);
  w[1] = str.charAt(l - 1);
  
  
  return new String(w);
}
 /* It basically the same as the previous one, the only difference is that this one rotates
 	to the right. This means, that we copy the last one char from the string and place them
 	in the first two places. */


/* Given a string, return a string length 1 from its front, unless front is false, in which 
  	case return a string length 1 from its back. The string will be non-empty. 


theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"    */

public String theEnd(String str, boolean front) {
 
    if (front) 
      return String.valueOf(str.charAt(0));
    else
      return String.valueOf(str.charAt(str.length() - 1));

}

/* In this exercise we use the method .valueOf(), which, concept from web:
-----> valueOf() is a static method present in String class. It is used to convert any data 
	type like int, double, char, char array to its string representation by creating a new 
	String object. We can also use valueOf() to convert a char array to a String, or a 
	subarray of a char array to a String.

	Knowing this, we first use .charAt() to convert the first and last letter from 
	string(input) to char, then we input that in .valueOf() to convert it back to a string.
	I do this because the function is specting a String to be returned.  */


/*  Given a string, return a version without both the first and last char of the string. 
	The string may be any length, including 0.


withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""    	*/

public String withouEnd2(String str) 
{
  if (str.length() <= 2)
   return "";
   
  char [] n = new char[str.length() - 2];
  
  for (int i = 1; i < str.length() - 1; i++)
    n[i - 1] = str.charAt(i);
    
  return new String (n);
}

/*  Here I applied the same principle as before, create a char array that fits the size 
	needed, in this case, an array with minus 2 spots because we are deleting the first and
	last letters from the input(string). Then we fill it iterating through the array and
	assignning each spot to a converted letter(from the string to char). Then we return 
	the new array as a String by typecasting it.  */



/*  Given a string of even length, return a string made of the middle two chars, 
	so the string "string" yields "ri". The string length will be at least 2.


middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"     */


public String middleTwo(String str) 
{
  
  int mid = str.length() / 2;
  
  char[] chars = str.toCharArray();
  
  return "" + chars[mid - 1] + chars[mid];

}
/* Here it was very simple, although, my original idea was caos. */




/* Given a string, return true if it ends in "ly".


endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false    */


public boolean endsLy(String str) 
{

  int length = str.length();
  
  if (length < 2)
    return false;
  
  if (str.charAt(length-2) == 'l' && str.charAt(length-1) == 'y')
    return true;
  else 
    return false;

}

/* Here at first I used the method .contains(), the problem is that this method will check
	throughout the whole string, when I only need to cheack the las two letters. Therefore,
	we need to convert the last to a char and then compare them, if both statements are true
	(line 201), then return TRUE; otherwise, return FALSE.  */





/*  Given a string and an int n, return a string made of the first and last n chars from 
	the string. The string length will be at least n.


nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"     */

public String nTwice(String str, int n) 
{
  String first = "";
  String second = "";
  
  int l = str.length();
  
  for (int i = 0; i < n; i++)
  {
    first += str.charAt(i);
  }
  
  for (int i = l - n; i < l; i++)
  {
    second += str.charAt(i);
  }
  
  return first + second;
}

/* First declare and initialize two strings, these will be use to store the fist and last
	n chars from the string(inputs), then use loops to iterate through the strngs and store
	the needed chars. Then use concatenation to return the wanted result.   */



/*   Given a string and an index, return a string length 2 starting at the given index. 
	If the index is too big or too small to define a string length 2, use the first 2 chars. 
	The string length will be at least 2.


twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"    */


public String twoChar(String str, int index) 
{
  
  int strLen = str.length();
  
  // If the index is out of bounds, use the first two characters of the string
  if (index < 0 || index > strLen - 2) {
    if (strLen < 2) {
      return str;
    } else {
      return str.charAt(0) + "" + str.charAt(1);
    }
  }
  
  // Otherwise, return the substring starting at the given index with length 2
  return str.charAt(index) + "" + str.charAt(index + 1);

    
}


/* Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". 
	The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"   */

public String middleThree(String str) {
  int remain = str.length() / 2;
  
  //char [] newC = str.toCharArray();
  //char [] arr = new char[remain];
  String s = "";
  
  return s + str.charAt(remain -1) + str.charAt(remain) + str.charAt(remain +1);
  
 // String s = "";
  
  /*if (str.length() == 3)
    return str;
  
  for (int i = remain; i < str.length() - remain; i++)
    s += str.charAt(i);
    

  return s;*/
}

/* The commented part was what i tried to do but it worked partially. The other part is more like
	hard coded but high logic at the same time. the key is to find the number to dived the length for
	*/






/* Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
  and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"    */



public String withoutX(String str) 
{
  if (str.length() > 0 && str.charAt(0) == 'x') {
    str = str.substring(1);
  }

  if (str.length() > 0 && str.charAt(str.length()-1) == 'x') {
    str = str.substring(0, str.length()-1);
  }
  
  return str;
  
  // Solution  notes: check for the 'x' in both spots. If found, use substring()
  // to grab the part without the 'x'. Check that the length is greater than 0
  // each time -- the need for the second length check is tricky to see.
  // One could .substring() instead of .charAt() to look into the string.
}


}
