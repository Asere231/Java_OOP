// What are all the errors preventing this from compiling? 
// Once we get it compiling (assuming we don't change any data types, 
// the public or private status of the class members, or the static or non-static
// status of those class members), what's the expected output of this program?

public class WarmupExercise
{
    public static int w;
    public int x;
    public static int y;
    public static final int z;

    public void printInfo()
    {
       System.out.println(w + ", " + x + ", " + y + ", " + z);
    }

    public static void main(String [] args)
    {
       WarmupExercise.w = 101;
       WarmupExercise.x = 102;
       WarmupExercise.y = 103;
       WarmupExercise.z = 104;

       WarmupExercise warmth1 = new WarmupExercise;
       WarmupExercise warmth2 = new WarmupExercise;

       warmth1.x = Math.random() * 50;
       warmth2.y = WarmupExercise.w;

       warmth1.printInfo();
       warmth2.printInfo();
    }
 }
